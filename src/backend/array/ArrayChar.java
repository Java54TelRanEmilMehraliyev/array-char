package backend.array;

public class ArrayChar {
   private char[] array;
   public ArrayChar(char[] array) {
	  this.array = array;
   }
   //Count
   public int countChars(char character) {
	   int count = 0;
	   for(char c: array) {
		   if(c == character) {
			   count++;
		   }
	   }
	   return count;
   }
   //compareTO
   public int compareTo(ArrayChar another) {
	   int length = Math.min(this.array.length, another.array.length); 
	   int index = 0;
	   while(index < length && this.array[index] == another.array[index]) {
		 index++; 
	   }
	   return index == length ? this.array.length - another.array.length
			   : this.array[index] - another.array[index];
   }
   
   //compareToIgnoreCase
   public int compareToIgnoreCase(ArrayChar another) {
	   int length = Math.min(this.array.length, another.array.length);
	   int index = 0;
	   while(index < length && Character.toLowerCase(this.array[index]) == Character.toLowerCase(another.array[index])) {
		   index++;
	   }
	   return index == length ? this.array.length - another.array.length
			   : Character.toLowerCase(this.array[index]) - Character.toLowerCase(another.array[index]);
   }
   
   // indexOf
   public int indexOf(char character) {
	  int index = 0;
	  while(index < this.array.length && array[index] != character) {
		 index++; 
	  }
	   return index == array.length ? -1 : index;
   }
   //lastIndexOf
   public int lastIndexOf(char character) {
       int index = array.length-1;
       while(index > -1 && this.array[index] != character) {
    	   index--;
       }
	   return index;
   }
   // contains
   public boolean contains(char character) {
	   for(char c : array) {
		   if(c == character) {
			   return true;
		   }
	   }
	   return false;
   }
   public boolean equals(ArrayChar another) {
      if(this.array.length != another.array.length) {
    	  return false;
      }
      for (int i = 0; i < this.array.length;i++) {
    	  if(this.array[i] != another.array[i]) {
    		  return false;
    	  }
      }
      return true;
   }
   public boolean equalsIgnoreCase(ArrayChar another) {
	   if(this.array.length != another.array.length) {
		   return false;
	   }
	   for (int i = 0; i < this.array.length; i++) {
		  char char1 = Character.toUpperCase(this.array[i]);
		   char char2 = Character.toUpperCase(another.array[i]);
			  if(char1 != char2) {
				  return false;
		   }
	   }
	   return true;
   }
}