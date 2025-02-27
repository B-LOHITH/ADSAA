class shortest{
    public static void main(String args[]){
        int c[][]= {{0,10,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,30,Integer.MAX_VALUE},
        {Integer.MAX_VALUE,0,20,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
        {Integer.MAX_VALUE,Integer.MAX_VALUE,0,15,5,Integer.MAX_VALUE,Integer.MAX_VALUE},
        {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0,12,Integer.MAX_VALUE,20},
        {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0,Integer.MAX_VALUE,7},
        {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0,35},
        {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0}};
        int l=c.length;
        int v=0;
        int d[]=new int[l];
        boolean s[]=new boolean[l];
        for(int i=0;i<l;i++){
            d[i]=c[v][i];
        }
        s[v]=true;
        for(int j=1;j<l;j++){
            int u=-1;
            int min=Integer.MAX_VALUE;
            for(int k=0;k<l;k++){
                if(d[k]<min && !s[k]){
                    min=d[k];
                    u=k;
                 }
            }
            s[u]=true;
            for(int i=0;i<l;i++){
                if(!s[i] && d[i]>c[u][i]+d[u] && c[u][i]!=Integer.MAX_VALUE){
                    d[i]=c[u][i]+d[u];
             }

            }   
        }
        for(int i=0;i<l;i++){
            System.out.println("Vertex "+i+" is at a distance of "+d[i]);
        }
            
    }

}