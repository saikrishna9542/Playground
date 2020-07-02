void reverse(char *str) 
{ 
   if (*str!='\0') 
   { 
       reverse(str+1); 
       printf("%c", *str); 
   } 
} 
  
/* Driver program to test above function */
int main() 
{ 
   char a[100];
   scanf("%[^\n]s",a);
   reverse(a); 
   return 0; 
} 