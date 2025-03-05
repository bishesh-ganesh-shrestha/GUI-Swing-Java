package drawingPolygons;

import javax.swing.JFrame;

public class DrawPolygons_bishesh {
    public static void main( String[] args )
    {
        JFrame frame = new JFrame( "Drawing Polygons - Bishesh" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        PolygonsJPanel_bishesh polygonsJPanel = new PolygonsJPanel_bishesh();
        frame.add( polygonsJPanel );

        frame.setSize( 280, 270 );
        frame.setVisible( true );
    }
}
