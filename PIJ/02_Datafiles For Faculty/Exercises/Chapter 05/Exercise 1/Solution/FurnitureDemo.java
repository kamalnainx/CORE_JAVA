package chapter05;

class FurnitureDemo
    {
        public static void main(String[] args)
        {
            Bookshelf b1 = new Bookshelf();
            Chair c1 = new Chair();
            b1.Accept();
            b1.Display();
            c1.Accept();
            c1.Display();

        }
    }