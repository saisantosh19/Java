import java.lang.*;
import java.util.*;
class armstrong
{
int i,n,k,sum=0;
n=153;
k=n;
while(n!=0)
{
i=n%10;
sum=sum+i*i*i;
n=n/10;
}
System.out.println(sum);
if(sum==k)
{
System.println("Armstrong number");
}
else
{
System.println("Not an Armstrong number");
}
}
}