
public enum azz {

   a("a", 0, "INVERT_MOUSE", 0, "options.invertMouse", false, true),
   b("b", 1, "SENSITIVITY", 1, "options.sensitivity", true, false),
   c("c", 2, "FOV", 2, "options.fov", true, false),
   ZOOM("ZOOM", 3, "ZOOM", 2, "ZOOM", true, false),
   d("d", 4, "GAMMA", 3, "options.gamma", true, false),
   e("e", 5, "SATURATION", 4, "options.saturation", true, false),
   f("f", 6, "RENDER_DISTANCE", 5, "options.renderDistance", true, false, 2.0F, 16.0F, 1.0F),
   g("g", 7, "VIEW_BOBBING", 6, "options.viewBobbing", false, true),
   h("h", 8, "ANAGLYPH", 7, "options.anaglyph", false, true),
   i("i", 9, "ADVANCED_OPENGL", 8, "options.advancedOpengl", false, true),
   j("j", 10, "FRAMERATE_LIMIT", 9, "options.framerateLimit", true, false, 10.0F, 260.0F, 10.0F),
   k("k", 11, "FBO_ENABLE", 10, "options.fboEnable", false, true),
   l("l", 12, "DIFFICULTY", 11, "options.difficulty", false, false),
   m("m", 13, "GRAPHICS", 12, "options.graphics", false, false),
   n("n", 14, "AMBIENT_OCCLUSION", 13, "options.ao", false, false),
   o("o", 15, "GUI_SCALE", 14, "options.guiScale", false, false),
   p("p", 16, "RENDER_CLOUDS", 15, "options.renderClouds", false, true),
   q("q", 17, "PARTICLES", 16, "options.particles", false, false),
   r("r", 18, "CHAT_VISIBILITY", 17, "options.chat.visibility", false, false),
   s("s", 19, "CHAT_COLOR", 18, "options.chat.color", false, true),
   t("t", 20, "CHAT_LINKS", 19, "options.chat.links", false, true),
   u("u", 21, "CHAT_OPACITY", 20, "options.chat.opacity", true, false),
   v("v", 22, "CHAT_LINKS_PROMPT", 21, "options.chat.links.prompt", false, true),
   w("w", 23, "USE_SERVER_TEXTURES", 22, "options.serverTextures", false, true),
   x("x", 24, "SNOOPER_ENABLED", 23, "options.snooper", false, true),
   y("y", 25, "USE_FULLSCREEN", 24, "options.fullscreen", false, true),
   z("z", 26, "ENABLE_VSYNC", 25, "options.vsync", false, true),
   A("A", 27, "SHOW_CAPE", 26, "options.showCape", false, true),
   B("B", 28, "TOUCHSCREEN", 27, "options.touchscreen", false, true),
   C("C", 29, "CHAT_SCALE", 28, "options.chat.scale", true, false),
   D("D", 30, "CHAT_WIDTH", 29, "options.chat.width", true, false),
   E("E", 31, "CHAT_HEIGHT_FOCUSED", 30, "options.chat.height.focused", true, false),
   F("F", 32, "CHAT_HEIGHT_UNFOCUSED", 31, "options.chat.height.unfocused", true, false),
   G("G", 33, "MIPMAP_LEVELS", 32, "options.mipmapLevels", true, false, 0.0F, 4.0F, 1.0F),
   H("H", 34, "ANISOTROPIC_FILTERING", 33, "options.anisotropicFiltering", true, false, 1.0F, 16.0F, 0.0F),
   I("I", 35, "FORCE_UNICODE_FONT", 34, "options.forceUnicodeFont", false, true);
   private final boolean J;
   private final boolean K;
   private final String L;
   private final float M;
   private float N;
   private float O;
   private static final azz[] P = new azz[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I};
   // $FF: synthetic field
   private static final azz[] $VALUES = new azz[]{a, b, c, ZOOM, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I};


   public static azz a(int var0) {
      azz[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         azz var4 = var1[var3];
         if(var4.c() == var0) {
            return var4;
         }
      }

      return null;
   }

   private azz(String var1, int var2, String var11, int var21, String var3, boolean var4, boolean var5) {
      this(var1, var2, var11, var21, var3, var4, var5, 0.0F, 1.0F, 0.0F);
   }

   private azz(String var1, int var2, String var11, int var21, String var3, boolean var4, boolean var5, float var6, float var7, float var8) {
      this.L = var3;
      this.J = var4;
      this.K = var5;
      this.N = var6;
      this.O = var7;
      this.M = var8;
   }

   public boolean a() {
      return this.J;
   }

   public boolean b() {
      return this.K;
   }

   public int c() {
      return this.ordinal();
   }

   public String d() {
      return this.L;
   }

   public float f() {
      return this.O;
   }

   public void a(float var1) {
      this.O = var1;
   }

   public float c(float var1) {
      return ou.a((this.e(var1) - this.N) / (this.O - this.N), 0.0F, 1.0F);
   }

   public float d(float var1) {
      return this.e(this.N + (this.O - this.N) * ou.a(var1, 0.0F, 1.0F));
   }

   public float e(float var1) {
      var1 = this.f(var1);
      return ou.a(var1, this.N, this.O);
   }

   protected float f(float var1) {
      if(this.M > 0.0F) {
         var1 = this.M * (float)Math.round(var1 / this.M);
      }

      return var1;
   }

   private azz(String var1, int var2, String var11, int var21, String var3, boolean var4, boolean var5, float var6, float var7, float var8, azx var9) {
      this(var1, var2, var11, var21, var3, var4, var5, var6, var7, var8);
   }

   static float a(azz var0) {
      return var0.O;
   }

}
