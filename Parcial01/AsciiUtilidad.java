/**
 * Write a description of class AsciiUtilidad here.
 *
 * @author (Jacobo Rave Londoño)
 * @version (2020/02/28)
 */
public class AsciiUtilidad {

    private int num;
    private char letra;

    public int deAsciiAInt(char c) {
        switch(c)
        {
            case 'A':
            num=0; break;
            case 'B':
            num=1; break;
            case 'C':
            num=2; break;
            case 'D':
            num=3; break;
            case 'E':
            num=4; break;
            case 'F':
            num=5; break;
            case 'G':
            num=6; break;
            case 'H':
            num=7; break;
            case 'I':
            num=8; break;
            case 'J':
            num=9; break;
            case 'K':
            num=10; break;
            case 'L':
            num=11; break;
            case 'M':
            num=12; break;
            case 'N':
            num=13; break;
            case 'O':
            num=14; break;
            case 'P':
            num=15; break;
            case 'Q':
            num=16; break;
            case 'R':
            num=17; break;
            case 'S':
            num=18; break;
            case 'T':
            num=19; break;
            case 'U':
            num=20; break;
            case 'V':
            num=21; break;
            case 'W':
            num=22; break;
            case 'X':
            num=23; break;
            case 'Y':
            num=24; break;
            case 'Z':
            num=25; break;

        }
        return num;
    }

    public char deIntAAscii(int i) {
        switch(i){
            case 0:
            letra='A'; 
            break;
            case 1:
            letra='B'; 
            break;
            case 2:
            letra='C';
            break;
            case 3:
            letra='D'; 
            break;
            case 4:
            letra='E'; 
            break;
            case 5:
            letra='F';
            break;
            case 6:
            letra='G';
            break;
            case 7:
            letra='H';
            break;
            case 8:
            letra='I';
            break;
            case 9:
            letra='J';
            break;
            case 10:
            letra='K';
            break;
            case 11:
            letra='L'; 
            break;
            case 12:
            letra='M';
            break;
            case 13:
            letra='N'; 
            break;
            case 14:
            letra='O'; 
            break;
            case 15:
            letra='P';
            break;
            case 16:
            letra='Q'; 
            break;
            case 17:
            letra='R'; 
            break;
            case 18:
            letra='S';
            break;
            case 19:
            letra='T';
            break;
            case 20:
            letra='U';
            break;
            case 21:
            letra='V';
            break;
            case 22:
            letra='W'; 
            break;
            case 23:
            letra='X'; 
            break;
            case 24:
            letra='Y'; 
            break;
            case 25:
            letra='Z';
            break;
        }

        return letra;
    }
}
