#include<stdio.h>
void main()
{
  char name[20];
  int vc=0;
  int cc=0;
  int i=0;
  puts("Enter the name");
  fgets(name,20,stdin);
  while(name[i]!='\0')
   {
     if(name[i]=='a' || name[i]=='A' ||name[i]=='e'||name[i]=='E' ||name[i]=='i' ||name[i]=='I' ||name[i]=='o' ||name[i]=='O' ||name[i]=='u'||name[i]=='U')
      {
         vc++;
      }
      else
      {
        cc++;
      }
      i++;
   }
 printf("total no of vowel=%d\n",vc);  
  printf("total no of consonant=%d\n",cc);
}
