import com.google.common.collect.Maps;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class azw {

   private static final Logger ax = LogManager.getLogger();
   private static final Gson ay = new Gson();
   private static final ParameterizedType az = new azx();
   private static final String[] aA = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
   private static final String[] aB = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
   private static final String[] aC = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
   public float a = 0.5F;
   public boolean b;
   public int c = -1;
   public boolean d = true;
   public boolean e;
   public boolean f;
   public boolean g = true;
   public int h = 120;
   public boolean i = true;
   public int j = 2;
   public boolean k = true;
   public List l = new ArrayList();
   public xn m;
   public boolean n;
   public boolean o;
   public boolean p;
   public float q;
   public boolean r;
   public boolean s;
   public boolean t;
   public boolean u;
   public boolean v;
   public boolean w;
   public boolean x;
   public boolean y;
   public boolean z;
   public int A;
   public int B;
   public boolean C;
   public float D;
   public float E;
   public float F;
   public float G;
   public boolean H;
   public int I;
   public int J;
   private Map aD;
   public aza K;
   public aza L;
   public aza M;
   public aza N;
   public aza O;
   public aza P;
   public aza Q;
   public aza R;
   public aza S;
   public aza T;
   public aza U;
   public aza V;
   public aza W;
   public aza X;
   public aza Y;
   public aza Z;
   public aza aa;
   public aza ab;
   public static aza aabb;
   public aza[] ac;
   public aza[] ad;
   protected azd ae;
   private File aE;
   public pq af;
   public boolean ag;
   public int ah;
   public boolean ai;
   public boolean aj;
   public String ak;
   public boolean al;
   public boolean am;
   public boolean an;
   public float ao;
   public float ap;
   public float aq;
   public float ar;
   public float as;
   public int at;
   public int au;
   public String av;
   public boolean aw;
   public w wubwub;
   public static float zoomSetting = 4.0F;


   public azw(azd var1, File var2) {
      this.m = xn.a;
      this.n = true;
      this.o = true;
      this.p = true;
      this.q = 1.0F;
      this.r = true;
      this.s = true;
      this.u = true;
      this.x = true;
      this.y = true;
      this.C = true;
      this.D = 1.0F;
      this.E = 1.0F;
      this.F = 0.44366196F;
      this.G = 1.0F;
      this.H = true;
      this.I = 4;
      this.J = 1;
      this.aD = Maps.newEnumMap(w.class);
      this.K = new aza("key.forward", 17, "key.categories.movement");
      this.L = new aza("key.left", 30, "key.categories.movement");
      this.M = new aza("key.back", 31, "key.categories.movement");
      this.N = new aza("key.right", 32, "key.categories.movement");
      this.O = new aza("key.jump", 57, "key.categories.movement");
      this.P = new aza("key.sneak", 42, "key.categories.movement");
      this.Q = new aza("key.inventory", 18, "key.categories.inventory");
      this.R = new aza("key.use", -99, "key.categories.gameplay");
      this.S = new aza("key.drop", 16, "key.categories.gameplay");
      this.T = new aza("key.attack", -100, "key.categories.gameplay");
      this.U = new aza("key.pickItem", -98, "key.categories.gameplay");
      this.V = new aza("key.sprint", 29, "key.categories.gameplay");
      this.W = new aza("key.chat", 20, "key.categories.multiplayer");
      this.X = new aza("key.playerlist", 15, "key.categories.multiplayer");
      this.Y = new aza("key.command", 53, "key.categories.multiplayer");
      this.Z = new aza("key.screenshot", 60, "key.categories.misc");
      this.aa = new aza("key.togglePerspective", 63, "key.categories.misc");
      this.ab = new aza("key.smoothCamera", 0, "key.categories.misc");
      aabb = new aza("Zoom key", 29, "key.categories.misc");
      this.ac = new aza[]{new aza("key.hotbar.1", 2, "key.categories.inventory"), new aza("key.hotbar.2", 3, "key.categories.inventory"), new aza("key.hotbar.3", 4, "key.categories.inventory"), new aza("key.hotbar.4", 5, "key.categories.inventory"), new aza("key.hotbar.5", 6, "key.categories.inventory"), new aza("key.hotbar.6", 7, "key.categories.inventory"), new aza("key.hotbar.7", 8, "key.categories.inventory"), new aza("key.hotbar.8", 9, "key.categories.inventory"), new aza("key.hotbar.9", 10, "key.categories.inventory")};
      this.ad = (aza[])((aza[])ArrayUtils.addAll(new aza[]{this.T, this.R, this.K, this.L, this.M, this.N, this.O, this.P, this.S, this.Q, this.W, this.X, this.U, this.Y, this.Z, this.aa, this.ab, aabb, this.V}, this.ac));
      this.af = pq.c;
      this.ak = "";
      this.ao = 1.0F;
      this.ap = 1.0F;
      this.av = "en_US";
      this.aw = false;
      this.ae = var1;
      this.aE = new File(var2, "options.txt");
      azz.f.a(16.0F);
      this.c = var1.S()?12:8;
      this.a();
   }

   public azw() {
      this.m = xn.a;
      this.n = true;
      this.o = true;
      this.p = true;
      this.q = 1.0F;
      this.r = true;
      this.s = true;
      this.u = true;
      this.x = true;
      this.y = true;
      this.C = true;
      this.D = 1.0F;
      this.E = 1.0F;
      this.F = 0.44366196F;
      this.G = 1.0F;
      this.H = true;
      this.I = 4;
      this.J = 1;
      this.aD = Maps.newEnumMap(w.class);
      this.K = new aza("key.forward", 17, "key.categories.movement");
      this.L = new aza("key.left", 30, "key.categories.movement");
      this.M = new aza("key.back", 31, "key.categories.movement");
      this.N = new aza("key.right", 32, "key.categories.movement");
      this.O = new aza("key.jump", 57, "key.categories.movement");
      this.P = new aza("key.sneak", 42, "key.categories.movement");
      this.Q = new aza("key.inventory", 18, "key.categories.inventory");
      this.R = new aza("key.use", -99, "key.categories.gameplay");
      this.S = new aza("key.drop", 16, "key.categories.gameplay");
      this.T = new aza("key.attack", -100, "key.categories.gameplay");
      this.U = new aza("key.pickItem", -98, "key.categories.gameplay");
      this.V = new aza("key.sprint", 29, "key.categories.gameplay");
      this.W = new aza("key.chat", 20, "key.categories.multiplayer");
      this.X = new aza("key.playerlist", 15, "key.categories.multiplayer");
      this.Y = new aza("key.command", 53, "key.categories.multiplayer");
      this.Z = new aza("key.screenshot", 60, "key.categories.misc");
      this.aa = new aza("key.togglePerspective", 63, "key.categories.misc");
      this.ab = new aza("key.smoothCamera", 0, "key.categories.misc");
      aabb = new aza("key.bindZoom", 29, "key.categories.misc");
      this.ac = new aza[]{new aza("key.hotbar.1", 2, "key.categories.inventory"), new aza("key.hotbar.2", 3, "key.categories.inventory"), new aza("key.hotbar.3", 4, "key.categories.inventory"), new aza("key.hotbar.4", 5, "key.categories.inventory"), new aza("key.hotbar.5", 6, "key.categories.inventory"), new aza("key.hotbar.6", 7, "key.categories.inventory"), new aza("key.hotbar.7", 8, "key.categories.inventory"), new aza("key.hotbar.8", 9, "key.categories.inventory"), new aza("key.hotbar.9", 10, "key.categories.inventory")};
      this.ad = (aza[])((aza[])ArrayUtils.addAll(new aza[]{this.T, this.R, this.K, this.L, this.M, this.N, this.O, this.P, this.S, this.Q, this.W, this.X, this.U, this.Y, this.Z, this.aa, this.ab, aabb, this.V}, this.ac));
      this.af = pq.c;
      this.ak = "";
      this.ao = 1.0F;
      this.ap = 1.0F;
      this.av = "en_US";
      this.aw = false;
   }

   public static String c(int var0) {
      return var0 < 0?bra.a("key.mouseButton", new Object[]{Integer.valueOf(var0 + 101)}):Keyboard.getKeyName(var0);
   }

   public static boolean a(aza var0) {
      return var0.i() == 0?false:(var0.i() < 0?Mouse.isButtonDown(var0.i() + 100):Keyboard.isKeyDown(var0.i()));
   }

   public void a(aza var1, int var2) {
      var1.b(var2);
      this.b();
   }

   public void a(azz var1, float var2) {
      if(var1 == azz.b) {
         this.a = var2;
      }

      if(var1 == azz.ZOOM) {
         zoomSetting = var2;
      }

      if(var1 == azz.c) {
         this.aq = var2;
      }

      if(var1 == azz.d) {
         this.ar = var2;
      }

      if(var1 == azz.j) {
         this.h = (int)var2;
      }

      if(var1 == azz.u) {
         this.q = var2;
         this.ae.r.b().b();
      }

      if(var1 == azz.E) {
         this.G = var2;
         this.ae.r.b().b();
      }

      if(var1 == azz.F) {
         this.F = var2;
         this.ae.r.b().b();
      }

      if(var1 == azz.D) {
         this.E = var2;
         this.ae.r.b().b();
      }

      if(var1 == azz.C) {
         this.D = var2;
         this.ae.r.b().b();
      }

      int var3;
      if(var1 == azz.H) {
         var3 = this.J;
         this.J = (int)var2;
         if((float)var3 != var2) {
            this.ae.R().b(this.J);
            this.ae.B();
         }
      }

      if(var1 == azz.G) {
         var3 = this.I;
         this.I = (int)var2;
         if((float)var3 != var2) {
            this.ae.R().a(this.I);
            this.ae.B();
         }
      }

      if(var1 == azz.f) {
         this.c = (int)var2;
      }

   }

   public void a(azz var1, int var2) {
      if(var1 == azz.a) {
         this.b = !this.b;
      }

      if(var1 == azz.o) {
         this.at = this.at + var2 & 3;
      }

      if(var1 == azz.q) {
         this.au = (this.au + var2) % 3;
      }

      if(var1 == azz.g) {
         this.d = !this.d;
      }

      if(var1 == azz.p) {
         this.k = !this.k;
      }

      if(var1 == azz.I) {
         this.aw = !this.aw;
         this.ae.l.a(this.ae.Q().a() || this.aw);
      }

      if(var1 == azz.i) {
         this.f = !this.f;
         this.ae.g.a();
      }

      if(var1 == azz.k) {
         this.g = !this.g;
      }

      if(var1 == azz.h) {
         this.e = !this.e;
         this.ae.b();
      }

      if(var1 == azz.l) {
         this.af = pq.a(this.af.a() + var2 & 3);
      }

      if(var1 == azz.m) {
         this.i = !this.i;
         this.ae.g.a();
      }

      if(var1 == azz.n) {
         this.j = (this.j + var2) % 3;
         this.ae.g.a();
      }

      if(var1 == azz.r) {
         this.m = xn.a((this.m.a() + var2) % 3);
      }

      if(var1 == azz.s) {
         this.n = !this.n;
      }

      if(var1 == azz.t) {
         this.o = !this.o;
      }

      if(var1 == azz.v) {
         this.p = !this.p;
      }

      if(var1 == azz.w) {
         this.r = !this.r;
      }

      if(var1 == azz.x) {
         this.s = !this.s;
      }

      if(var1 == azz.A) {
         this.y = !this.y;
      }

      if(var1 == azz.B) {
         this.z = !this.z;
      }

      if(var1 == azz.y) {
         this.t = !this.t;
         if(this.ae.K() != this.t) {
            this.ae.n();
         }
      }

      if(var1 == azz.z) {
         this.u = !this.u;
         Display.setVSyncEnabled(this.u);
      }

      this.b();
   }

   public float a(azz var1) {
      return var1 == azz.c?this.aq:(var1 == azz.ZOOM?zoomSetting:(var1 == azz.d?this.ar:(var1 == azz.e?this.as:(var1 == azz.b?this.a:(var1 == azz.u?this.q:(var1 == azz.E?this.G:(var1 == azz.F?this.F:(var1 == azz.C?this.D:(var1 == azz.D?this.E:(var1 == azz.j?(float)this.h:(var1 == azz.H?(float)this.J:(var1 == azz.G?(float)this.I:(var1 == azz.f?(float)this.c:0.0F)))))))))))));
   }

   public boolean b(azz var1) {
      switch(azy.a[var1.ordinal()]) {
      case 1:
         return this.b;
      case 2:
         return this.d;
      case 3:
         return this.e;
      case 4:
         return this.f;
      case 5:
         return this.g;
      case 6:
         return this.k;
      case 7:
         return this.n;
      case 8:
         return this.o;
      case 9:
         return this.p;
      case 10:
         return this.r;
      case 11:
         return this.s;
      case 12:
         return this.t;
      case 13:
         return this.u;
      case 14:
         return this.y;
      case 15:
         return this.z;
      case 16:
         return this.aw;
      default:
         return false;
      }
   }

   private static String a(String[] var0, int var1) {
      if(var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      return bra.a(var0[var1], new Object[0]);
   }

   public String c(azz paramazz) {
      String str1 = bra.a(paramazz.d(), new Object[0]) + ": ";
      if(paramazz.a()) {
         float str22 = this.a(paramazz);
         float f2 = paramazz.c(str22);
         return paramazz == azz.b?(f2 == 0.0F?str1 + bra.a("options.sensitivity.min", new Object[0]):(f2 == 1.0F?str1 + bra.a("options.sensitivity.max", new Object[0]):str1 + (int)(f2 * 200.0F) + "%")):(paramazz == azz.c?(f2 == 0.0F?str1 + bra.a("options.fov.min", new Object[0]):(f2 == 1.0F?str1 + bra.a("options.fov.max", new Object[0]):str1 + (int)(70.0F + f2 * 40.0F))):(paramazz == azz.j?(paramazz == azz.d?str1 + bra.a("options.framerateLimit.max", new Object[0]):str1 + (int)str22 + " fps"):(paramazz == azz.d?(f2 == 0.0F?str1 + bra.a("options.gamma.min", new Object[0]):(f2 == 1.0F?str1 + bra.a("options.gamma.max", new Object[0]):str1 + "+" + (int)(f2 * 100.0F) + "%")):(paramazz == azz.e?str1 + (int)(f2 * 400.0F) + "%":(paramazz == azz.u?str1 + (int)(f2 * 90.0F + 10.0F) + "%":(paramazz == azz.F?str1 + bao.b(f2) + "px":(paramazz == azz.E?str1 + bao.b(f2) + "px":(paramazz == azz.D?str1 + bao.a(f2) + "px":(paramazz == azz.f?str1 + (int)str22 + " chunks":(paramazz == azz.H?(str22 == 1.0F?str1 + bra.a("options.off", new Object[0]):str1 + (int)str22):(paramazz == azz.G?(str22 == 0.0F?str1 + bra.a("options.off", new Object[0]):str1 + (int)str22):(f2 == 0.0F?str1 + bra.a("options.off", new Object[0]):str1 + (int)(f2 * 100.0F) + "%"))))))))))));
      } else if(paramazz.b()) {
         boolean str21 = this.b(paramazz);
         return str21?str1 + bra.a("options.on", new Object[0]):str1 + bra.a("options.off", new Object[0]);
      } else if(paramazz == azz.l) {
         return str1 + bra.a(this.af.b(), new Object[0]);
      } else if(paramazz == azz.o) {
         return str1 + a(aA, this.at);
      } else if(paramazz == azz.r) {
         return str1 + bra.a(this.m.b(), new Object[0]);
      } else if(paramazz == azz.q) {
         return str1 + a(aB, this.au);
      } else if(paramazz == azz.n) {
         return str1 + a(aC, this.j);
      } else if(paramazz == azz.m) {
         if(this.i) {
            return str1 + bra.a("options.graphics.fancy", new Object[0]);
         } else {
            String str2 = "options.graphics.fast";
            return str1 + bra.a("options.graphics.fast", new Object[0]);
         }
      } else {
         return str1;
      }
   }

   public void a() {
      try {
         if(!this.aE.exists()) {
            return;
         }

         BufferedReader var9 = new BufferedReader(new FileReader(this.aE));
         String var2 = "";
         this.aD.clear();

         while((var2 = var9.readLine()) != null) {
            try {
               String[] var8 = var2.split(":");
               if(var8[0].equals("mouseSensitivity")) {
                  this.a = this.a(var8[1]);
               }

               if(var8[0].equals("fov")) {
                  this.aq = this.a(var8[1]);
               }

               if(var8[0].equals("zoom")) {
                  zoomSetting = this.a(var8[1]);
               }

               if(var8[0].equals("gamma")) {
                  this.ar = this.a(var8[1]);
               }

               if(var8[0].equals("saturation")) {
                  this.as = this.a(var8[1]);
               }

               if(var8[0].equals("invertYMouse")) {
                  this.b = var8[1].equals("true");
               }

               if(var8[0].equals("renderDistance")) {
                  this.c = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("guiScale")) {
                  this.at = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("particles")) {
                  this.au = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("bobView")) {
                  this.d = var8[1].equals("true");
               }

               if(var8[0].equals("anaglyph3d")) {
                  this.e = var8[1].equals("true");
               }

               if(var8[0].equals("advancedOpengl")) {
                  this.f = var8[1].equals("true");
               }

               if(var8[0].equals("maxFps")) {
                  this.h = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("fboEnable")) {
                  this.g = var8[1].equals("true");
               }

               if(var8[0].equals("difficulty")) {
                  this.af = pq.a(Integer.parseInt(var8[1]));
               }

               if(var8[0].equals("fancyGraphics")) {
                  this.i = var8[1].equals("true");
               }

               if(var8[0].equals("ao")) {
                  if(var8[1].equals("true")) {
                     this.j = 2;
                  } else if(var8[1].equals("false")) {
                     this.j = 0;
                  } else {
                     this.j = Integer.parseInt(var8[1]);
                  }
               }

               if(var8[0].equals("clouds")) {
                  this.k = var8[1].equals("true");
               }

               if(var8[0].equals("resourcePacks")) {
                  this.l = (List)ay.fromJson(var2.substring(var2.indexOf(58) + 1), az);
                  if(this.l == null) {
                     this.l = new ArrayList();
                  }
               }

               if(var8[0].equals("lastServer") && var8.length >= 2) {
                  this.ak = var2.substring(var2.indexOf(58) + 1);
               }

               if(var8[0].equals("lang") && var8.length >= 2) {
                  this.av = var8[1];
               }

               if(var8[0].equals("chatVisibility")) {
                  this.m = xn.a(Integer.parseInt(var8[1]));
               }

               if(var8[0].equals("chatColors")) {
                  this.n = var8[1].equals("true");
               }

               if(var8[0].equals("chatLinks")) {
                  this.o = var8[1].equals("true");
               }

               if(var8[0].equals("chatLinksPrompt")) {
                  this.p = var8[1].equals("true");
               }

               if(var8[0].equals("chatOpacity")) {
                  this.q = this.a(var8[1]);
               }

               if(var8[0].equals("serverTextures")) {
                  this.r = var8[1].equals("true");
               }

               if(var8[0].equals("snooperEnabled")) {
                  this.s = var8[1].equals("true");
               }

               if(var8[0].equals("fullscreen")) {
                  this.t = var8[1].equals("true");
               }

               if(var8[0].equals("enableVsync")) {
                  this.u = var8[1].equals("true");
               }

               if(var8[0].equals("hideServerAddress")) {
                  this.v = var8[1].equals("true");
               }

               if(var8[0].equals("advancedItemTooltips")) {
                  this.w = var8[1].equals("true");
               }

               if(var8[0].equals("pauseOnLostFocus")) {
                  this.x = var8[1].equals("true");
               }

               if(var8[0].equals("showCape")) {
                  this.y = var8[1].equals("true");
               }

               if(var8[0].equals("touchscreen")) {
                  this.z = var8[1].equals("true");
               }

               if(var8[0].equals("overrideHeight")) {
                  this.B = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("overrideWidth")) {
                  this.A = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("heldItemTooltips")) {
                  this.C = var8[1].equals("true");
               }

               if(var8[0].equals("chatHeightFocused")) {
                  this.G = this.a(var8[1]);
               }

               if(var8[0].equals("chatHeightUnfocused")) {
                  this.F = this.a(var8[1]);
               }

               if(var8[0].equals("chatScale")) {
                  this.D = this.a(var8[1]);
               }

               if(var8[0].equals("chatWidth")) {
                  this.E = this.a(var8[1]);
               }

               if(var8[0].equals("showInventoryAchievementHint")) {
                  this.H = var8[1].equals("true");
               }

               if(var8[0].equals("mipmapLevels")) {
                  this.I = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("anisotropicFiltering")) {
                  this.J = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("forceUnicodeFont")) {
                  this.aw = var8[1].equals("true");
               }

               aza[] var4 = this.ad;
               int var5 = var4.length;

               int var6;
               for(var6 = 0; var6 < var5; ++var6) {
                  aza var10 = var4[var6];
                  if(var8[0].equals("key_" + var10.g())) {
                     var10.b(Integer.parseInt(var8[1]));
                  }
               }

               w var10000 = this.wubwub;
               w[] var111 = w.values();
               var5 = var4.length;

               for(var6 = 0; var6 < var5; ++var6) {
                  w var11 = var111[var6];
                  if(var8[0].equals("soundCategory_" + var11.a())) {
                     this.aD.put(var11, Float.valueOf(this.a(var8[1])));
                  }
               }
            } catch (Exception var91) {
               ax.warn("Skipping bad option: " + var2);
            }
         }

         aza.b();
         var9.close();
      } catch (Exception var101) {
         ax.error("Failed to load options", var101);
      }

   }

   private float a(String var1) {
      return var1.equals("true")?1.0F:(var1.equals("false")?0.0F:Float.parseFloat(var1));
   }

   public void b() {
      try {
         PrintWriter var6 = new PrintWriter(new FileWriter(this.aE));
         var6.println("invertYMouse:" + this.b);
         var6.println("mouseSensitivity:" + this.a);
         var6.println("fov:" + this.aq);
         var6.println("gamma:" + this.ar);
         var6.println("zoom:" + zoomSetting);
         var6.println("saturation:" + this.as);
         var6.println("renderDistance:" + this.c);
         var6.println("guiScale:" + this.at);
         var6.println("particles:" + this.au);
         var6.println("bobView:" + this.d);
         var6.println("anaglyph3d:" + this.e);
         var6.println("advancedOpengl:" + this.f);
         var6.println("maxFps:" + this.h);
         var6.println("fboEnable:" + this.g);
         var6.println("difficulty:" + this.af.a());
         var6.println("fancyGraphics:" + this.i);
         var6.println("ao:" + this.j);
         var6.println("clouds:" + this.k);
         var6.println("resourcePacks:" + ay.toJson(this.l));
         var6.println("lastServer:" + this.ak);
         var6.println("lang:" + this.av);
         var6.println("chatVisibility:" + this.m.a());
         var6.println("chatColors:" + this.n);
         var6.println("chatLinks:" + this.o);
         var6.println("chatLinksPrompt:" + this.p);
         var6.println("chatOpacity:" + this.q);
         var6.println("serverTextures:" + this.r);
         var6.println("snooperEnabled:" + this.s);
         var6.println("fullscreen:" + this.t);
         var6.println("enableVsync:" + this.u);
         var6.println("hideServerAddress:" + this.v);
         var6.println("advancedItemTooltips:" + this.w);
         var6.println("pauseOnLostFocus:" + this.x);
         var6.println("showCape:" + this.y);
         var6.println("touchscreen:" + this.z);
         var6.println("overrideWidth:" + this.A);
         var6.println("overrideHeight:" + this.B);
         var6.println("heldItemTooltips:" + this.C);
         var6.println("chatHeightFocused:" + this.G);
         var6.println("chatHeightUnfocused:" + this.F);
         var6.println("chatScale:" + this.D);
         var6.println("chatWidth:" + this.E);
         var6.println("showInventoryAchievementHint:" + this.H);
         var6.println("mipmapLevels:" + this.I);
         var6.println("anisotropicFiltering:" + this.J);
         var6.println("forceUnicodeFont:" + this.aw);
         aza[] var2 = this.ad;
         int var3 = var2.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            aza var7 = var2[var4];
            var6.println("key_" + var7.g() + ":" + var7.i());
         }

         w var10000 = this.wubwub;
         w[] var81 = w.values();
         var3 = var81.length;

         for(var4 = 0; var4 < var3; ++var4) {
            w var8 = var81[var4];
            var6.println("soundCategory_" + var8.a() + ":" + this.a(var8));
         }

         var6.close();
      } catch (Exception var71) {
         ax.error("Failed to save options", var71);
      }

      this.c();
   }

   public float a(w var1) {
      return this.aD.containsKey(var1)?((Float)this.aD.get(var1)).floatValue():1.0F;
   }

   public void a(w var1, float var2) {
      this.ae.V().a(var1, var2);
      this.aD.put(var1, Float.valueOf(var2));
   }

   public void c() {
      if(this.ae.h != null) {
         this.ae.h.a.a(new ii(this.av, this.c, this.m, this.n, this.af, this.y));
      }

   }

   public boolean d() {
      return this.c >= 4 && this.k;
   }

}
