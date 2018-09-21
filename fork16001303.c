
                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h> 
#include <sys/types.h> 
#include <unistd.h>

  
void forkexample() 
{ 
        int sum1=0;
        int sum2=0;
        
        int  A[10]={10, 3, 4, 5, 15, 16, 21, 8, 30, 24};
        int x=1;
        if(fork()==0){
            for(int i=5;i<10;i++){
                sum1+=A[i];
            }
            
            printf("Addition of last five elements using child process %d   ",sum1);
        }
        else{
             for(int i=0;i<5;i++){
                sum2+=A[i];
            }
            
            printf("Addition of first 5 elements using parent process %d ",sum2);
        }
} 
int main() 
{ 
    forkexample(); 
    return 0; 
}