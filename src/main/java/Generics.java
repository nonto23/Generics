

 class Generics<T>{

        private T stringInstance;
        private T stringT;

     //setting the variables
        public void setIntegers(T integers)
        {
            this.stringInstance=integers;
        }
        public void setStringT(T stringT)
        {
          this.stringT=stringT;
        }

     //getting the variables
         public T getIntegers()
         {
            return stringInstance;
         }
          public T getStringT()
          {
            return stringT;
         }
     public <T> void printArrayContent(T[] array){
         for (T elements:array)
         {
             // Print both integer and/or string elements
             System.out.print(elements + " ");
         }
         System.out.println("");
     }



        public static void main(String args[]){



            Generics type = new Generics();

            //evoking printContent to display both string and integers
            type.printArrayContent(new Integer[]{12,2,36});
            type.printArrayContent(new String[]{"generics", "is", "challenging"});

            Generics<String> stringInstance  = new Generics<String>();
            //Assign a value to stringElement
            stringInstance .setStringT("Test");

            //displaying out Test
            System.out.println(stringInstance .getStringT());

            //Assign a value to intElement
            Generics<Integer> integerInstance = new Generics<>();
            integerInstance.setIntegers(1000);
            System.out.println(integerInstance.getIntegers()); // display out 1000
        }


}
