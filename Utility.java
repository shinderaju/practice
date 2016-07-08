package practice;
import java.util.*;
public class Utility{

//function to find triple having sum 0      
public void findTriple(int list[],int n)
{
            boolean flag=false;
            int sum=0;
            for(int i=0;i<n;i++)
            {
              for(int j=i+1;j<n;j++)
              {
                for(int k=j+1;k<n;k++)
                {
                  sum=list[i]+list[j]+list[k];
                  if(sum==0)
                  {
                    System.out.println("triple is "+list[i]+" "+list[j]+" "+list[k]);
                    flag=true;
                  }   
                } 
              }
            }
                 
            if(flag)
             System.out.println("triple is found");
            else
             System.out.println("no triple is found");
}

//functin is used to find string are anagram or not
public boolean checkAnagram(String str1,String str2)
{
           boolean flag=false;
           int l1=str1.length();
           int l2=str2.length();
    
           if(l1==l2)
           {
              char[] ch1=str1.toCharArray();
              char[] ch2=str2.toCharArray();
              for(int i=0;i<l1;i++)
              {
                for(int j=0;j<l2;j++)
                {
                 if(ch1[i]==ch2[j])
                 {
                  flag=true;
                  break;
                 }
                 else
                  flag=false;
               }
             }
           }
           else
            flag=false;
           return flag;
}

//count no. of  heads and tails in flips
public void countHT(int n)
{
           int head=0,tail=0;
           float phead=0,ptail=0;
        
           Random r= new Random();
           for(int i=1;i<=n;i++)
           {
             if(r.nextInt(n)%2<0.5)
              head++;
             else
              tail++;
           }  
           System.out.println("no. of heads= "+head);
           System.out.println("no. of tails= "+tail);
           phead=head*(100/n);
           ptail=tail*(100/n);
           System.out.println("percentage of heads= "+phead);
           System.out.println("percentage of tails= "+ptail);
}

//count harmonic value 1/1+1/2+1/3+...+1/n
public float harmonicValue(int n){
           float sum=0;
           for(float i=1;i<=n;i++)
           {
            sum=sum+(1/i);
           }
           return sum;

}

//check valid user name
public boolean checkUname(String uname)
{
           if(uname.length()<3)
           {
            return false;
           }
           else
           { 
            return true;
           }
}
 
//replace string by username
public void replace(String st,String uname)
{
         
           if(checkUname(uname))
           {
             String st1=st.replaceAll("username",uname);
             System.out.println(st1);
           }
           else
           { 
             System.out.println("username is invalid");
           }

} 


//print table for  power of two less than 2^n
public void printPower(int n)
{
          for(int i=0;i<=n;i++)  
          {
            System.out.println(Math.pow(2,i));
          }
}


//gambler game to find percentage of win and loss
public void gambler(int stake,int goal,int n) 
{
          int bets = 0;       
          int wins = 0;        
          int loss = 0;
       
          for (int i = 0; i < n; i++) 
          {
        	int amount = stake;
            while (amount > 0 && amount < goal) 
            {
              bets++;
              if(Math.random() < 0.5)
                amount++;     
              else                    
                amount--;     
            }
            if(amount == goal) 
              wins++; 
            else 
             loss++;              
          }

     
          System.out.println(wins + " wins of " + n);
          System.out.println("Percent of games won = " + 100.0 * wins / n);
          System.out.println("Percent of games loss = " + 100.0 * loss / n);
          System.out.println("Avg # bets           = " + 1.0 * bets / n);
}


//check year is leap year or not
public boolean checkLeap(int year)
{
         boolean flag=false;
         if(year%400==0)
          flag=true;
         else
          if(year%100==0)
           flag=false;
          else
          if(year%4==0)
            flag=true;
          else
            flag=false;
         return flag;
 }


//return start time of stopwatch
public long startStopWatch(){
         long start = System.currentTimeMillis();
         return start;
              
}

//return elapsed time between start and end of task
public void elapsde(long start)
{
        long stop = System.currentTimeMillis();
        long elap= (stop-start)/1000;
        System.out.println("elapsed time is "+elap+" seconds");
}

//create and display 2D array
public void createArray(int m,int n)
{
        int [][] array= new int[m][n]; 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
          {
            array[i][j]=sc.nextInt();
          }
        }
        System.out.println("array is: ");
        for(int i=0;i<m;i++)
        {
          System.out.println("");
          for(int j=0;j<n;j++)
          {
           System.out.print(array[i][j]);
           System.out.print("\t");
          }
        }
}
//binary search when you don't know min and max index
public static int bSearch(String[] words, String value) 
{
        return bSearch(words, value, 0, words.length - 1);
}
//binary search when you know min and max index    
public static int bSearch(String[] words, String value, int min, int max) 
{
        if (min > max) 
        {
          return -1;
        }
        int mid = (max + min) / 2;
        if (words[mid].equals(value)) 
        {
          return mid;
        } 
        else 
        { 
          if(words[mid].compareTo(value) > 0) 
          {
            return bSearch(words, value, min, mid - 1);
          } 
          else 
          {
           return bSearch(words, value, mid + 1, max);
           }
        }
}

//find prime factors of number			
public void findPrimeFactor(long n)
{ 
          System.out.print("The prime factors of " + n + " are: ");
          for (long i = 2; i*i <= n; i++)
          {
           while (n % i == 0) 
           {
             System.out.print(i + " "); 
             n = n / i;
           }
          }
          if (n > 1) System.out.println(n);
          else       System.out.println();
}

//bubble sort for integer array
public void BubbleSort(int[] arr,int n)
{
         int temp;
        
         for(int r=1;r<=n-1;r++)
         {
           for(int i=0;i<=n-i-1;i++)
           {
             if(arr[i]>arr[i+1])
             {
     
            	 temp=arr[i];
            	 arr[i]=arr[i+1];
            	 arr[i+1]=temp;
             }   
           }
         }
}
//bubble sort for string array
public void BubbleSort(String[] arr,int n)
{
         String temp;
        
         for(int i=0;i<n;i++)
         {
           for(int j=0;j<=n-i-1;j++)
           {
             if(arr[j].compareTo(arr[j+1])>0)
             {
              
              temp=arr[j+1];
              arr[j+1]=arr[j];
              arr[j]=temp;
             }   
          }
        }
}

//insertion sort for int
public void insertionSort(int[] arr,int n)
{
      System.out.println("welcome to insertion sort");
      for(int i=1;i<n;i++)
      { 
        int temp=arr[i];
        for(int j=i-1;j>=0 && arr[j]>temp;j--)
        {    
         arr[j+1]=arr[j];
         arr[j]=temp;
        }
      }
}

//insertion sort for string
public void insertionSort(String[] arr,int n)
{
      System.out.println("welcome to insertion sort");
      for(int i=1;i<n;i++)
      { 
        String temp=arr[i];
        for(int j=i-1;j>=0 &&  arr[j].compareTo(temp)>0;j--)   
        {    
         arr[j+1]=arr[j];
         arr[j]=temp;
        }
      }
}

}

    
