import java.io.*;
class perfect
{int n;
    perfect()
        {
            n=0;
        }
        perfect(int x)
        {
            n=x;
        }
        int check()
        {
            int i,s=0;
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    s=s+i;
                }
            }
            if(s==n)
            return 1;
            else
            return 0;
        }
    }