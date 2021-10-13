package pgdp.pinguart;

import static pgdp.MiniJava.*;

public class PinguArt {

	public static void main(String[] args) {

        int i=0, num;
        int art[][] = new int [8][8];
        while (i<8)
        {
            num=readInt("Please enter a Pingu Art number:");
            if(num<10000000)
            {
                int DigitNum=0,index=7;
                while (num>0)
                {
                    art[i][index]=num%10;
                    DigitNum++;
                    num=num/10;
                    index--;}
                while (DigitNum<8)
                {
                    art[i][index]=0;
                    index--;
                    DigitNum++;
                }
            }
            else {
                int index=7;
                while (num>0) {
                    art[i][index] =num % 10;
                    index--;
                    num = num / 10;
                }

            }
            i++;
        }
        i=0;
        write("+---[PinguArt]---+");
        int ArtNumber=0;
        while (i<4)
        {
            System.out.print("|");
            int SymbolIndex=7;
            while (SymbolIndex>-1)
            {

                if(art[ArtNumber][SymbolIndex]==0) {System.out.print(' ');}
                else if(art[ArtNumber][SymbolIndex]==1) System.out.print('-');
                else if(art[ArtNumber][SymbolIndex]==2) System.out.print('~');
                else System.out.print('P');

                if(SymbolIndex==0) ArtNumber++;
                SymbolIndex--;
            }
            SymbolIndex=7;
            while (SymbolIndex> -1)
            {
                if(art[ArtNumber][SymbolIndex]==0) System.out.print(' ');
                else if(art[ArtNumber][SymbolIndex]==1) System.out.print('-');
                else if(art[ArtNumber][SymbolIndex]==2) System.out.print('~');
                else System.out.print('P');

                if(SymbolIndex==0) ArtNumber++;
                SymbolIndex--;
            }
            write("|");
            i++;
        }
        write("+----------------+");






	}
}
