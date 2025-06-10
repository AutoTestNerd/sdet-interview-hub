package com.sdet.InterviewPrograms.DynamicProgramming;
//youTube -https://www.youtube.com/watch?v=VGDHph1k0tQ
public class BulbSwitcher_IV {
    public static void main(String[] args) {
        String target = "001011101";
        int future= 0;
        int ans=0;
        for (int i = 0; i < target.length(); i++) {
//            System.out.println(target.charAt(i)-'0');
            System.out.print(future);
            if (future==target.charAt(i)-'0'){
                continue;
            }
            else {
                ans++;
                if(future==0){
                    future=1;
                }
                else {
                    future=0;
                }
            }
//            System.out.print(future);

        }
System.out.println(ans);}

}
