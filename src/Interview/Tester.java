package Interview;
        class Tester{
            int x=30;
            void display(){
                int x=40;
                System.out.println(x);
                System.out.println(this.x);
            }

            public static void main(String[] args) {
                new Tester().display();
            }
        }



