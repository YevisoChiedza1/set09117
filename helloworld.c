/*
This program with add two numbers and print their result, 
including a hello world message
*/
#include <stdio.h>
int main(int argc, char **argv){
	printf("Hello World, This is my first C program");
	
	int x = 5, y = 3;
	int z = x + y;
	
	//print the results to the screen
	printf("\n x is %d, y is %d, sum is %d",x,y,z);
	return 0;
}