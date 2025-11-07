/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import javax.swing.*;

class Search extends JFrame implements FileVisitor, ActionListener {

    JFrame f;
    JTextArea t11;
    JPanel p, p1;
    JTextField txtsearch;
    JTextArea area;
    JButton Searchbutton;
    JLabel Searchresults;
    String new1;
    public boolean found = false;
    Path searchedFile;
    JLabel imagelabel = new JLabel();

    public Search() {
        f = new JFrame();
        f.setLayout(null);
        JLabel label = new JLabel("Effective File Search");
        label.setIcon(null);
        f.add(label);
        label.setBounds(145, 10, 150, 10);
        JLabel label2 = new JLabel("Enter file name: ");
        f.add(label2);
        label2.setBounds(65, 30, 150, 20);
        txtsearch = new JTextField(20);
        txtsearch.setBounds(165, 30, 150, 20);
        f.add(txtsearch);
        Searchbutton = new JButton("Search");
        f.add(Searchbutton);
        Searchbutton.setBounds(135, 70, 100, 20);
        Searchbutton.addActionListener(this);
        Searchresults = new JLabel("Search Results");
        f.add(Searchresults);
        Searchresults.setBounds(135, 90, 100, 20);
        f.setSize(400, 300);
        t11 = new JTextArea(15, 30);
        t11.setBounds(65, 110, 250, 120);
        JScrollPane scroller = new JScrollPane(t11);
        JScrollBar bar = new JScrollBar();
        scroller.add(bar);
        f.add(t11);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        try {
            Path searchDir = null;
            File[] roots = File.listRoots();
            EnumSet opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
            String filename = txtsearch.getText();
            for (File root : roots) 
            {
                if (!found) 
                {
                    // searchDir = Paths.get(root.getPath());
                    searchDir = Paths.get("D:/");
                    Files.walkFileTree(searchDir, opts, Integer.MAX_VALUE, this);
                }
            }
            if (!found) {
                t11.setText("The file " + filename + " was not found !");
                //JOptionPane.showMessageDialog(this, "The file " + filename + " was not found !");
                //System.out.println("The file " + filename + " was not found!");
            }
        } catch (IOException e) {
            System.out.println("Exception raised");
        }
    }
    StringBuilder s = new StringBuilder();
    String text = "";

    boolean search(Path file) throws IOException {
        String filename = txtsearch.getText();
        String s1 = "Comparing " + file.getFileName().toString() + " with " + filename;
        if (file.getFileName().toString().equals(filename)) 
        {
            text = ("Searched file was found in " + file.getParent());
            s.append(text + "\n\n");
            t11.setLineWrap(true);
            t11.setWrapStyleWord(true);
            t11.setText(s.toString());
            found = true;
            return true;
        }
        return false;
    }

    @Override
    public FileVisitResult postVisitDirectory(Object dir, IOException exc)
            throws IOException {
        f.add(imagelabel);
        imagelabel.setVisible(true);
        String s = "Visited: " + (Path) dir;
        System.out.println(s);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs)
            throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs)
            throws IOException {
        boolean success = search((Path) file);
        if ((!success)) {
            return FileVisitResult.CONTINUE;

        } else {
            return FileVisitResult.CONTINUE;
        }
    }

    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc)
            throws IOException {
        return FileVisitResult.CONTINUE;
    }
}

class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Search obj = new Search();
    }
}
