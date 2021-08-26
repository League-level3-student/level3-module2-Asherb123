// 1. Create an array of ints. Don't initialize it yet.

 int [] arr;
void setup() {
  // 2. Set the size of your window to at least 500 width 500 height
  size(500, 500);

  // 3. Initialize your array to 50

 arr  = new int [50];
  
  // 4. Initialize the ints in the array with random numbers
  //    from 0 to the built-in height variable, (int)random(height)
   
    for(int i = 0; i< arr.length; i++){
      arr[i] = (int)random(height) ;
    
  }

  // 5. Call the noStroke() method to remove the outline for each shape
  noStroke();
}

void draw() {
  // 6. Set the background color with background(r, g, b);
background(#000205);

  // 7. Set the color for your graph using the fill() method
fill(#F6FF08);

  // 8. Draw a rectangle for each int in your array.
  //    the x value will be the loop variable multipled by (width/intArray.length)
  //    the y value will the height variable
  //    the width is (width/intArray.length)
  //    the height is the negative array value at the array index, e.g. -intArray[ i ]

 for(int i = 0; i< arr.length; i++){
     rect((width/arr.length)*i, height, width/arr.length, -arr[i]);
    
  }

  // 9. Call the stepSort method
  
 stepSort(arr);
  

  // 10. Extract the code from step 4 that randomizes the array into a new method.
  

  // 11. Call the method you made in step 10 when the mouse is pressed using the mousePressed variable
  if(mousePressed){
  randArray();
}
}
int startIndex = 1;

void stepSort(int[] arr) {
  for (int i = startIndex; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;

      startIndex = i;
      return;
    }
  }
  startIndex = 1;
}
void randArray(){
  for(int i = 0; i< arr.length; i++){
      arr[i] = (int)random(height) ;
    
  }
  
}
