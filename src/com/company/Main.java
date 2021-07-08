package com.company;

public class Main {

    public static void main(String[] args) {
/*       Test Data
         int [] firstTestData = {4,4,4,4,4};
         int [] secondTestData = {0,-1,-2,-100,1};
         int [] thirdTestData = {0,0,0,0,-1};
         int [] fourthTestData = {5,4,3,2,1,0};
         int [] fifthTestData = {0,1,2,3,4,5};
         int [] sixthTestData = {0,1};
         int [] seventhTestData = {1};
*/
	    int [] firstArr = {88,55,66,44,100,89};
	    int firstNum = firstArr[0];
        int firstMin = firstNum;
	    int secondMin = firstMin;

        //firstMin
	    for (int num : firstArr ) {
	        if(num < firstMin){
                firstMin = num;
            }
	    }

        //secondMin
        for (int num : firstArr ) {
            if(num == firstMin){
                continue;
            }
            else if(num < firstNum){         //if use firstMin then there is no less, so I use the firstNum
                secondMin = num;
            }
        }

        System.out.println("first min : " + firstMin);
        System.out.println("Second min : " + secondMin);
    }
}
