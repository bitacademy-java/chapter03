package chapter03;

public class WatchTV {

	public static void main(String[] args) {
        TV tv = new TV(7, 20, false);  	
        
        tv.status();	
        
        tv.power( true );
        tv.volume( 120 );
        tv.status();		          
        
        tv.volume( false );
        tv.status();
        
        tv.volume( 255 );
        tv.status();
  
        tv.power(false);
        tv.volume( true );
        tv.status();
        
        
        tv.power(true);
        tv.channel( 0 );
        tv.status();		          
        
        tv.channel( false );
        tv.channel( false );
        tv.channel( false );
        tv.status();

        tv.power( false );
        tv.status();
	}

}
