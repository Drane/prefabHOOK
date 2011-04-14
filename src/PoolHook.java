class PoolHook extends Thread {
	PrefabHook hook;
	GlobalEventListener g_gl;

	PoolHook(GlobalEventListener gl) {
		g_gl = gl;
	}

	public void run() {
		hook = new PrefabHook();
		hook.registerHook(g_gl);
	}

}