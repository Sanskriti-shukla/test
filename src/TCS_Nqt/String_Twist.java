package TCS_Nqt;

import java.util.Scanner;

public class String_Twist {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string ..");
        String s1=sc.next();
        System.out.println("enter second string");
        String s2=sc.next();
        System.out.println("enter third string");
        String s3=sc.next();
        String str1=" ";
        String str2=" ";
        String  str3=" ";
        char c;
        for (int i=0; i<str1.length(); i++){
            c=s1.charAt(i);
            if (c=='A'|| c=='a'|| c=='e'|| c=='E'|| c=='i'||c=='I'|| c=='o'|| c=='O'|| c=='U'||c=='u'){
                str1=str1+"%";
            }
            else
                str1=str1+c;
        }
        for (int i=0; i<str2.length(); i++){
            c=s2.charAt(i);
                if (c>='a' && c<='z' || c>='A' && c<='Z'){
                    if (c=='A'|| c=='a'|| c=='e'|| c=='E'|| c=='i'||c=='I'|| c=='o'|| c=='O'|| c=='U'||c=='u')
                        str2=str2+c;
                        else
                        str2=str2+"#";
                    }
                    else
                        str2=str2+c;
                }
            str3 = s3.toUpperCase();
            System.out.println(str1+str2+str3);
            }
        }


