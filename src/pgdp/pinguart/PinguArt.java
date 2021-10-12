package pgdp.pinguart;

import static pgdp.MiniJava.*;

public class PinguArt {

	public static void main(String[] args) {


int i=0, x;
char a[][] = new char [8][8];
while (i<8)
{
    x=readInt();
    if(x<10000000)
    {
        int k=0,m=7;
        while (x>0)
        {
            a[i][m]= (char) (x%10+48);
        k++;
        x=x/10;
        m--;}
        while (k<8)
        {
            a[i][m]='0';
            m--;
            k++;
        }
    }
    else {
        int m=7;
        while (x>0) {
            a[i][m] = (char) (x % 10 + 48);
            m--;
            x = x / 10;
        }

    }
i++;
}
i=0;
write("+---[PinguArt]---+");
int l=0;
while (i<4)
{
  System.out.print("|");
  int k=7;
  while (k>-1)
  {

       if(a[l][k]=='0') {System.out.print(' ');}
       else if(a[l][k]=='1') System.out.print('-');
      else if(a[l][k]=='2') System.out.print('~');
      else System.out.print('P');

      if(k==0) l++;
      k--;
  }
  k=7;
  while (k> -1)
  {
      if(a[l][k]=='0') System.out.print(' ');
      else if(a[l][k]=='1') System.out.print('-');
      else if(a[l][k]=='2') System.out.print('~');
      else System.out.print('P');

      if(k==0) l++;
      k--;
  }
  write("|");
  i++;
}
write("+----------------+");





	}
}
