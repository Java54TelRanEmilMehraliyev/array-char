package backend.array;

public class ArrayChar {
   private char[] array;
   public ArrayChar(char[] array) {
	  this.array = array;
   }
   public int countChars(char character) {
	   int count = 0;
	   for(char c: array) {
		   if(c == character) {
			   count++;
		   }
	   }
	   return count;
   }
   
   public int compareTo(ArrayChar another) {
	   int length = Math.min(this.array.length, another.array.length); 
	   int index = 0;
	   while(index < length && this.array[index] == another.array[index]) {
		 index++; 
	   }
	   return index == length ? this.array.length - another.array.length
			   : this.array[index] - another.array[index];
   }
   public int indexOf(char character) {
	  int index = 0;
	  while(index < this.array.length && array[index] != character) {
		 index++; 
	  }
	   return index == array.length ? -1 : index;
   }
   public int lastIndexOf(char character) {
       int index = array.length-1;
       while(index > -1 && this.array[index] != character) {
    	   index--;
       }
	   return index;
   }
}