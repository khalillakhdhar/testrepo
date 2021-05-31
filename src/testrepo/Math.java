package testrepo;

public class Math {
private int a,b;
public int calculePGCD()
{
int x=a;
int y=b;
while(x!=y)
{
if(x>y)
	x=x-y;
else
	y=y-x;
}

return x;
}


}
