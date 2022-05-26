
import java.util.Scanner;
public class Bai1_9{
	public static String nhap(){
	      Scanner input= new Scanner(System.in);
	      boolean check=false;
	      String s="";
	      while(!check){
	         System.out.print(" ");
	         try {
	            s=input.nextLine();
	            
	            check=true;
	         } catch (Exception e) {
	            System.out.println("Sai du lieu, moi ban nhap lai");
	            input.nextLine();    
	         }
	      } 
	      return (s);
	   }
	   public static int leng(String a[], int n){
		      int count=0;
		      for(int i=0; i<n; i++)
		      {
		         if(a[i].length()>4)
		         count++;
		      }
		      return (count);
		   }
		 public static String maxleng(String a[], int n) {
			 String max=a[0];
			 for(int i=0;i<n;i++)
			 {
				 if(max.length()<a[i].length())
					 max=a[i];
			 }
			 return max;
		 }
		 public static int lengThan(String a[], int n){
		      int count=0;
		      for(int i=0; i<n; i++)
		      {
		         if(a[i].charAt(0)>=48 && a[i].charAt(0)<=57)
		         count++;
		      }
		      return (count);
		   }
		 public static String[] charAt(String a[],int n)
		 {
			 	int n1=lengThan(a, n);
	      		int index=0;
	      		String[] newArrayy= new String[n1];
		      for(int i=0; i<n; i++)
		      {
				if(a[i].charAt(0)>=48 && a[i].charAt(0)<=57)
		         {
		            newArrayy[index]=a[i];
		            index++;
		         }
		      }
		      return(newArrayy) ;
		   }
		   public static void main(String[] args){
		      int i,n;
		      Scanner  = new Scanner(System.in);
		      System.out.println("Nhap so luong chuoi n=  ");
		      n=input.nextInt();
		      String[] array=new String[n];
		      for(i=0; i<n; i++)
		      {
		         System.out.println("Nhap phan tu thu "+(i+1)+" ");
		         array[i]=nhap();
		      }
		      System.out.println("Day vua nhap: ");
		      for(i=0; i<n; i++)
		      {
		         System.out.println(" "+array[i]);
		      }
		      System.out.println("So chuoi co chieu dai lon hon 4 ki tu la : "+leng(array, n));
		      System.out.println("Chuoi co chieu dai lon hon la :"+maxleng(array,n));
		      System.out.println("Cac chuoi bat dau bang ki tu chu so la: ");

		      String[] array2= charAt(array, n);
		      int n1= array2.length;
		      for(i=0; i<n1; i++)
		      {
		         System.out.println(" "+array2[i]);
		      }

		}
	}
