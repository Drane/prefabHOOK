class PrefabHook {

	static {
		try {
			System.loadLibrary("SysHook");
		} catch (UnsatisfiedLinkError e) {
			System.err.println("Native code library failed to load.\n" + e);
		}
		
	}

	void processKey(boolean ts, int vk, GlobalEventListener gl) {
		KeyboardEvent event = new KeyboardEvent(this, ts, vk, false, false);
		gl.keyPressed(event);
	}

	void mouseMoved(int cord_x, int cord_y, GlobalEventListener gl) {
		MouseEvent event = new MouseEvent(this, cord_x, cord_y);
		gl.mouseMoved(event);
	}

	native void registerHook(GlobalEventListener gl);

	native void unRegisterHook();

}