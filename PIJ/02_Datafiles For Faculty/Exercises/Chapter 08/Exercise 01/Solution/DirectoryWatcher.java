package chapter08;
import java.nio.file.WatchEvent.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.WatchEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DirectoryWatcher {
    JFrame f; 
    JLabel l;
    
    String directoryname;
    private Path path = null;
    Kind copy;
    WatchEvent eventcopy;
    WatchService watchService;

    private void initializeService() 
    {
        path = Paths.get(directoryname);
        System.out.println("Monitoring directory: "+directoryname);
        try {
            watchService = FileSystems.getDefault().newWatchService();
            path.register(watchService, ENTRY_CREATE, ENTRY_DELETE);   // register the watch service for the path.
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }
    }

    private void monitorDirectory() throws IOException {
        WatchKey key = null;
        String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
        Path file = Paths.get("D:/DirectoryLog_"+timeStamp+".txt");
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedWriter writer = Files.newBufferedWriter(file, charset, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            while (true) {  // infinite loop to monitor changes
                try {
                    key = watchService.take(); // get watch key
                    for (WatchEvent event : key.pollEvents()) {
                        Kind kind = event.kind(); // get event kind
                        copy = kind;
                        eventcopy = event;
                        writer.newLine();
                        writer.append("Log: The event that occurred on " + eventcopy.context().toString() + " is " + copy + "\n");
                        writer.newLine();
                        writer.flush();
                        System.out.println("The event that occurred on " + event.context().toString() + " is " + kind);
                    }
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException: " + e.getMessage());
                }
                boolean reset = key.reset();
                if (!reset) {
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DirectoryWatcher watchservicedemo = new DirectoryWatcher();
        System.out.println("Specify the directory you want to monitor:");
        watchservicedemo.directoryname = sc.nextLine();
        watchservicedemo.initializeService();
        try {
            watchservicedemo.monitorDirectory();

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}