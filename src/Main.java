public class Main implements KeyboardEventListener, MouseEventListener
{

	static GlobalEventListener gl;

	public static void main(String[] args) throws Exception
	{
		Main inst = new Main();
		gl = new GlobalEventListener();
		gl.addKeyboardEventListener(inst);
		gl.addMouseEventListener(inst);
	}

	public void GlobalKeyPressed( KeyboardEvent event )
	{
		System.out.println( "Key Pressed: " + event.getVirtualKeyCode() );
	}

	public void GlobalKeyReleased( KeyboardEvent event )
	{
		System.out.println( "Key Released: " + event.getVirtualKeyCode() );
	}

	@Override
	public void GlobalMouseMoved(MouseEvent event) {
		System.out.println("MouseMoved " + event.getX() + " " + event.getY());
	}

}