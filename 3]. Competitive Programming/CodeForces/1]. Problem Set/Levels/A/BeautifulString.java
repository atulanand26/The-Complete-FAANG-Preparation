package Divivsion_A;

import java.util.Scanner;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int flag = 0;
            //System.out.println(s);
            for (int i = 0; i < str.length()-1; i++) {
                if(str.charAt(i) == str.charAt(i+1) &&  str.charAt(i+1)!='?'){
                    System.out.println(-1);
                    flag = 1;
                    break;
                }
            }
            if(flag ==1){
                continue;
            }
            if(str.length()<2 && str.charAt(0) == '?'){
                System.out.println("a");
                continue;
            }
            if(str.length()==2 && str.charAt(0) == str.charAt(1) && str.charAt(1) == '?'){
                System.out.println("ab");
                continue;
            }
            String wd = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == '?'){
                    //System.out.println(true);
                    if(i+1<str.length() && i-1>0 && str.charAt(i+1)=='?'){
                        char k = wd.charAt(wd.length()-1);
                        if(k=='a'){
                            wd = wd+'b';
                        }
                        else if(k=='b'){
                            wd = wd+'c';
                        }
                       else{
                            wd = wd+'a';
                        }
                    }
                    else{
                        wd  =wd+ch;
                    }
                    /*
                    else{
                        char k = wd.charAt(wd.length()-1);
                        char k2 = str.charAt(i+1);
                        if(k=='a' && k2 == 'a'){
                            wd+='b';
                        }
                        else if(k=='b' && k2 =='b'){
                            wd = wd+'a';
                        }
                        else if((k=='a' && k2=='b') || (k=='b' && k2=='a')){
                            wd = wd+"c";
                        }
                        else if((k=='c' && k2=='b') || (k=='b' && k2=='c')){
                            wd = wd+"a";
                        }
                        else if((k=='a' && k2=='c') || (k=='c' && k2=='a')){
                            wd = wd+"b";
                        }
                    }*/
                }
                else{
                    wd = wd+ch;
                }
            }
            System.out.println(wd);
            String w = "";
            for (int i = 0; i < wd.length(); i++) {
                char ch = wd.charAt(i);
                if(i==0 && ch=='?'){
                    char k2 = wd.charAt(i+1);
                    if(k2=='a'){
                        w = w+'b';
                    }
                    else if(k2=='b'){
                        w = w+'c';
                    }
                    else{
                        w = w+'a';
                    }

                }
                else if(i==wd.length()-1 && ch=='?'){
                    char k2 = wd.charAt(i-1);
                    if(k2=='a'){
                        w = w+'b';
                    }
                    else if(k2=='b'){
                        w = w+'c';
                    }
                    else{
                        w = w+'a';
                    }
                }
                else if(ch=='?'){
                    char k = wd.charAt(i-1);
                    char k2 = wd.charAt(i+1);
                    if(k=='a' && k2 == 'a'){
                        w =w +'b';
                    }
                    else if(k=='b' && k2 =='b'){
                        w = w+'a';
                    }
                    else if(k=='c' && k2 =='c'){
                        w = w+'a';
                    }
                    else if((k=='a' && k2=='b') || (k=='b' && k2=='a')){
                        w = w+"c";
                    }
                    else if((k=='c' && k2=='b') || (k=='b' && k2=='c')){
                        w = w+"a";
                    }
                    else if((k=='a' && k2=='c') || (k=='c' && k2=='a')){
                        w = w+"b";
                    }
                    else{
                        w = w+ch;
                    }
                }
                else{
                    w = w+ch;
                }
            }

            String www = "";
            if(str.contains("?")){
                for (int i = 0; i < w.length(); i++) {
                    char ch = w.charAt(i);
                    if(i==0 && ch=='?'){
                        char k2 = w.charAt(i+1);
                        if(k2=='a'){
                            www = www+'b';
                        }
                        else if(k2=='b'){
                            www = www+'c';
                        }
                        else{
                            www = www+'a';
                        }

                    }
                    else if(i==w.length()-1 && ch=='?'){
                        char k2 = w.charAt(i-1);
                        if(k2=='a'){
                            www= www+'b';
                        }
                        else if(k2=='b'){
                            www = www+'c';
                        }
                        else{
                            www = www+'a';
                        }
                    }
                    else if(ch=='?'){
                        char k = w.charAt(i-1);
                        char k2 = w.charAt(i+1);
                        if(k=='a' && k2 == 'a'){
                            www =www +'b';
                        }
                        else if(k=='b' && k2 =='b'){
                            www = www+'a';
                        }
                        else if(k=='c' && k2 =='c'){
                            www = www+'a';
                        }
                        else if((k=='a' && k2=='b') || (k=='b' && k2=='a')){
                            www = www+"c";
                        }
                        else if((k=='c' && k2=='b') || (k=='b' && k2=='c')){
                            www = www+"a";
                        }
                        else if((k=='a' && k2=='c') || (k=='c' && k2=='a')){
                            www = www+"b";
                        }
                        else{
                            www = www+ch;
                        }
                    }
                    else{
                        www= www+ch;
                    }
                }
            }
            System.out.println(www);
        }

    }
}
