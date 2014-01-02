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

public class bac {

   private static final Logger aN = LogManager.getLogger();
   private static final Gson aO = new Gson();
   private static final ParameterizedType aP = new bad();
   private static final String[] aQ = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
   private static final String[] aR = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
   private static final String[] aS = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
   private static final String[] aT = new String[]{"options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high"};
   private static final String[] aU = new String[]{"options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never"};
   private static final String[] aV = new String[]{"options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods"};
   private static final String[] aW = new String[]{"options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk"};
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
   public xs m;
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
   private Map aX;
   public float K;
   public float L;
   public float M;
   public float N;
   public float O;
   public int P;
   public boolean Q;
   public String R;
   public int S;
   public int T;
   public int U;
   public azf V;
   public azf W;
   public azf X;
   public azf Y;
   public azf Z;
   public azf aa;
   public azf ab;
   public azf ac;
   public azf ad;
   public azf ae;
   public azf af;
   public azf ag;
   public azf ah;
   public azf ai;
   public azf aj;
   public azf ak;
   public azf al;
   public azf am;
   public static azf aabb;
   public azf an;
   public azf ao;
   public azf ap;
   public azf aq;
   public azf ar;
   public azf[] as;
   public azf[] at;
   protected azi au;
   private File aY;
   public pu av;
   public boolean aw;
   public int ax;
   public boolean ay;
   public boolean az;
   public String aA;
   public boolean aB;
   public boolean aC;
   public boolean aD;
   public float aE;
   public float aF;
   public float aG;
   public float aH;
   public float aI;
   public int aJ;
   public int aK;
   public String aL;
   public boolean aM;
   public w wubwub;
   public static float zoomSetting = 4.0F;


   public bac(azi var1, File var2) {
      this.m = xs.a;
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
      this.aX = Maps.newEnumMap(w.class);
      this.K = 0.5F;
      this.L = 1.0F;
      this.M = 1.0F;
      this.N = 0.5412844F;
      this.O = 0.31690142F;
      this.P = 1;
      this.Q = true;
      this.R = "";
      this.S = 0;
      this.T = 0;
      this.U = 0;
      this.V = new azf("key.forward", 17, "key.categories.movement");
      this.W = new azf("key.left", 30, "key.categories.movement");
      this.X = new azf("key.back", 31, "key.categories.movement");
      this.Y = new azf("key.right", 32, "key.categories.movement");
      this.Z = new azf("key.jump", 57, "key.categories.movement");
      this.aa = new azf("key.sneak", 42, "key.categories.movement");
      this.ab = new azf("key.inventory", 18, "key.categories.inventory");
      this.ac = new azf("key.use", -99, "key.categories.gameplay");
      this.ad = new azf("key.drop", 16, "key.categories.gameplay");
      this.ae = new azf("key.attack", -100, "key.categories.gameplay");
      this.af = new azf("key.pickItem", -98, "key.categories.gameplay");
      this.ag = new azf("key.sprint", 29, "key.categories.gameplay");
      this.ah = new azf("key.chat", 20, "key.categories.multiplayer");
      this.ai = new azf("key.playerlist", 15, "key.categories.multiplayer");
      this.aj = new azf("key.command", 53, "key.categories.multiplayer");
      this.ak = new azf("key.screenshot", 60, "key.categories.misc");
      this.al = new azf("key.togglePerspective", 63, "key.categories.misc");
      this.am = new azf("key.smoothCamera", 0, "key.categories.misc");
      aabb = new azf("Zoom Key", 29, "key.categories.misc");
      this.an = new azf("key.fullscreen", 87, "key.categories.misc");
      this.ao = new azf("key.streamStartStop", 64, "key.categories.stream");
      this.ap = new azf("key.streamPauseUnpause", 65, "key.categories.stream");
      this.aq = new azf("key.streamCommercial", 0, "key.categories.stream");
      this.ar = new azf("key.streamToggleMic", 0, "key.categories.stream");
      this.as = new azf[]{new azf("key.hotbar.1", 2, "key.categories.inventory"), new azf("key.hotbar.2", 3, "key.categories.inventory"), new azf("key.hotbar.3", 4, "key.categories.inventory"), new azf("key.hotbar.4", 5, "key.categories.inventory"), new azf("key.hotbar.5", 6, "key.categories.inventory"), new azf("key.hotbar.6", 7, "key.categories.inventory"), new azf("key.hotbar.7", 8, "key.categories.inventory"), new azf("key.hotbar.8", 9, "key.categories.inventory"), new azf("key.hotbar.9", 10, "key.categories.inventory")};
      this.at = (azf[])((azf[])ArrayUtils.addAll(new azf[]{this.ae, this.ac, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ad, this.ab, this.ah, this.ai, this.af, this.aj, this.ak, this.al, this.am, aabb, this.ag, this.ao, this.ap, this.aq, this.ar, this.an}, this.as));
      this.av = pu.c;
      this.aA = "";
      this.aE = 1.0F;
      this.aF = 1.0F;
      this.aL = "en_US";
      this.aM = false;
      this.au = var1;
      this.aY = new File(var2, "options.txt");
      baf.f.a(16.0F);
      this.c = var1.V()?12:8;
      this.a();
   }

   public bac() {
      this.m = xs.a;
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
      this.aX = Maps.newEnumMap(w.class);
      this.K = 0.5F;
      this.L = 1.0F;
      this.M = 1.0F;
      this.N = 0.5412844F;
      this.O = 0.31690142F;
      this.P = 1;
      this.Q = true;
      this.R = "";
      this.S = 0;
      this.T = 0;
      this.U = 0;
      this.V = new azf("key.forward", 17, "key.categories.movement");
      this.W = new azf("key.left", 30, "key.categories.movement");
      this.X = new azf("key.back", 31, "key.categories.movement");
      this.Y = new azf("key.right", 32, "key.categories.movement");
      this.Z = new azf("key.jump", 57, "key.categories.movement");
      this.aa = new azf("key.sneak", 42, "key.categories.movement");
      this.ab = new azf("key.inventory", 18, "key.categories.inventory");
      this.ac = new azf("key.use", -99, "key.categories.gameplay");
      this.ad = new azf("key.drop", 16, "key.categories.gameplay");
      this.ae = new azf("key.attack", -100, "key.categories.gameplay");
      this.af = new azf("key.pickItem", -98, "key.categories.gameplay");
      this.ag = new azf("key.sprint", 29, "key.categories.gameplay");
      this.ah = new azf("key.chat", 20, "key.categories.multiplayer");
      this.ai = new azf("key.playerlist", 15, "key.categories.multiplayer");
      this.aj = new azf("key.command", 53, "key.categories.multiplayer");
      this.ak = new azf("key.screenshot", 60, "key.categories.misc");
      this.al = new azf("key.togglePerspective", 63, "key.categories.misc");
      this.am = new azf("key.smoothCamera", 0, "key.categories.misc");
      aabb = new azf("Zoom Key", 29, "key.categories.misc");
      this.an = new azf("key.fullscreen", 87, "key.categories.misc");
      this.ao = new azf("key.streamStartStop", 64, "key.categories.stream");
      this.ap = new azf("key.streamPauseUnpause", 65, "key.categories.stream");
      this.aq = new azf("key.streamCommercial", 0, "key.categories.stream");
      this.ar = new azf("key.streamToggleMic", 0, "key.categories.stream");
      this.as = new azf[]{new azf("key.hotbar.1", 2, "key.categories.inventory"), new azf("key.hotbar.2", 3, "key.categories.inventory"), new azf("key.hotbar.3", 4, "key.categories.inventory"), new azf("key.hotbar.4", 5, "key.categories.inventory"), new azf("key.hotbar.5", 6, "key.categories.inventory"), new azf("key.hotbar.6", 7, "key.categories.inventory"), new azf("key.hotbar.7", 8, "key.categories.inventory"), new azf("key.hotbar.8", 9, "key.categories.inventory"), new azf("key.hotbar.9", 10, "key.categories.inventory")};
      this.at = (azf[])((azf[])ArrayUtils.addAll(new azf[]{this.ae, this.ac, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ad, this.ab, this.ah, this.ai, this.af, this.aj, this.ak, this.al, this.am, aabb, this.ag, this.ao, this.ap, this.aq, this.ar, this.an}, this.as));
      this.av = pu.c;
      this.aA = "";
      this.aE = 1.0F;
      this.aF = 1.0F;
      this.aL = "en_US";
      this.aM = false;
   }

   public static String c(int var0) {
      return var0 < 0?bsc.a("key.mouseButton", new Object[]{Integer.valueOf(var0 + 101)}):Keyboard.getKeyName(var0);
   }

   public static boolean a(azf var0) {
      return var0.i() == 0?false:(var0.i() < 0?Mouse.isButtonDown(var0.i() + 100):Keyboard.isKeyDown(var0.i()));
   }

   public void a(azf var1, int var2) {
      var1.b(var2);
      this.b();
   }

   public void a(baf var1, float var2) {
      if(var1 == baf.b) {
         this.a = var2;
      }

      if(var1 == baf.c) {
         this.aG = var2;
      }

      if(var1 == baf.d) {
         this.aH = var2;
      }

      if(var1 == baf.j) {
         this.h = (int)var2;
      }

      if(var1 == baf.u) {
         this.q = var2;
         this.au.r.b().b();
      }

      if(var1 == baf.E) {
         this.G = var2;
         this.au.r.b().b();
      }

      if(var1 == baf.F) {
         this.F = var2;
         this.au.r.b().b();
      }

      if(var1 == baf.D) {
         this.E = var2;
         this.au.r.b().b();
      }

      if(var1 == baf.C) {
         this.D = var2;
         this.au.r.b().b();
      }

      int var3;
      if(var1 == baf.H) {
         var3 = this.J;
         this.J = (int)var2;
         if((float)var3 != var2) {
            this.au.T().b(this.J);
            this.au.C();
         }
      }

      if(var1 == baf.G) {
         var3 = this.I;
         this.I = (int)var2;
         if((float)var3 != var2) {
            this.au.T().a(this.I);
            this.au.C();
         }
      }

      if(var1 == baf.f) {
         this.c = (int)var2;
      }

      if(var1 == baf.J) {
         this.K = var2;
      }

      if(var1 == baf.K) {
         this.L = var2;
         this.au.Z().s();
      }

      if(var1 == baf.L) {
         this.M = var2;
         this.au.Z().s();
      }

      if(var1 == baf.M) {
         this.N = var2;
      }

      if(var1 == baf.N) {
         this.O = var2;
      }

   }

   public void a(baf var1, int var2) {
      if(var1 == baf.a) {
         this.b = !this.b;
      }

      if(var1 == baf.o) {
         this.aJ = this.aJ + var2 & 3;
      }

      if(var1 == baf.q) {
         this.aK = (this.aK + var2) % 3;
      }

      if(var1 == baf.g) {
         this.d = !this.d;
      }

      if(var1 == baf.p) {
         this.k = !this.k;
      }

      if(var1 == baf.I) {
         this.aM = !this.aM;
         this.au.l.a(this.au.S().a() || this.aM);
      }

      if(var1 == baf.i) {
         this.f = !this.f;
         this.au.g.a();
      }

      if(var1 == baf.k) {
         this.g = !this.g;
      }

      if(var1 == baf.h) {
         this.e = !this.e;
         this.au.c();
      }

      if(var1 == baf.l) {
         this.av = pu.a(this.av.a() + var2 & 3);
      }

      if(var1 == baf.m) {
         this.i = !this.i;
         this.au.g.a();
      }

      if(var1 == baf.n) {
         this.j = (this.j + var2) % 3;
         this.au.g.a();
      }

      if(var1 == baf.r) {
         this.m = xs.a((this.m.a() + var2) % 3);
      }

      if(var1 == baf.O) {
         this.P = (this.P + var2) % 3;
      }

      if(var1 == baf.P) {
         this.Q = !this.Q;
      }

      if(var1 == baf.Q) {
         this.S = (this.S + var2) % 3;
      }

      if(var1 == baf.R) {
         this.T = (this.T + var2) % 3;
      }

      if(var1 == baf.S) {
         this.U = (this.U + var2) % 2;
      }

      if(var1 == baf.s) {
         this.n = !this.n;
      }

      if(var1 == baf.t) {
         this.o = !this.o;
      }

      if(var1 == baf.v) {
         this.p = !this.p;
      }

      if(var1 == baf.w) {
         this.r = !this.r;
      }

      if(var1 == baf.x) {
         this.s = !this.s;
      }

      if(var1 == baf.A) {
         this.y = !this.y;
      }

      if(var1 == baf.B) {
         this.z = !this.z;
      }

      if(var1 == baf.y) {
         this.t = !this.t;
         if(this.au.L() != this.t) {
            this.au.o();
         }
      }

      if(var1 == baf.z) {
         this.u = !this.u;
         Display.setVSyncEnabled(this.u);
      }

      this.b();
   }

   public float a(baf var1) {
      return var1 == baf.c?this.aG:(var1 == baf.d?this.aH:(var1 == baf.e?this.aI:(var1 == baf.b?this.a:(var1 == baf.u?this.q:(var1 == baf.E?this.G:(var1 == baf.F?this.F:(var1 == baf.C?this.D:(var1 == baf.D?this.E:(var1 == baf.j?(float)this.h:(var1 == baf.H?(float)this.J:(var1 == baf.G?(float)this.I:(var1 == baf.f?(float)this.c:(var1 == baf.J?this.K:(var1 == baf.K?this.L:(var1 == baf.L?this.M:(var1 == baf.M?this.N:(var1 == baf.N?this.O:0.0F)))))))))))))))));
   }

   public boolean b(baf var1) {
      switch(bae.a[var1.ordinal()]) {
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
         return this.Q;
      case 17:
         return this.aM;
      default:
         return false;
      }
   }

   private static String a(String[] var0, int var1) {
      if(var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      return bsc.a(var0[var1], new Object[0]);
   }

   public String c(baf var1) {
      String var2 = bsc.a(var1.d(), new Object[0]) + ": ";
      if(var1.a()) {
         float var32 = this.a(var1);
         float var4 = var1.c(var32);
         return var1 == baf.b?(var4 == 0.0F?var2 + bsc.a("options.sensitivity.min", new Object[0]):(var4 == 1.0F?var2 + bsc.a("options.sensitivity.max", new Object[0]):var2 + (int)(var4 * 200.0F) + "%")):(var1 == baf.c?(var4 == 0.0F?var2 + bsc.a("options.fov.min", new Object[0]):(var4 == 1.0F?var2 + bsc.a("options.fov.max", new Object[0]):var2 + (int)(70.0F + var4 * 40.0F))):(var1 == baf.j?(var32 == baf.a(var1)?var2 + bsc.a("options.framerateLimit.max", new Object[0]):var2 + (int)var32 + " fps"):(var1 == baf.d?(var4 == 0.0F?var2 + bsc.a("options.gamma.min", new Object[0]):(var4 == 1.0F?var2 + bsc.a("options.gamma.max", new Object[0]):var2 + "+" + (int)(var4 * 100.0F) + "%")):(var1 == baf.e?var2 + (int)(var4 * 400.0F) + "%":(var1 == baf.u?var2 + (int)(var4 * 90.0F + 10.0F) + "%":(var1 == baf.F?var2 + bav.b(var4) + "px":(var1 == baf.E?var2 + bav.b(var4) + "px":(var1 == baf.D?var2 + bav.a(var4) + "px":(var1 == baf.f?var2 + (int)var32 + " chunks":(var1 == baf.H?(var32 == 1.0F?var2 + bsc.a("options.off", new Object[0]):var2 + (int)var32):(var1 == baf.G?(var32 == 0.0F?var2 + bsc.a("options.off", new Object[0]):var2 + (int)var32):(var1 == baf.N?var2 + bvb.a(var4) + " fps":(var1 == baf.M?var2 + bvb.b(var4) + " Kbps":(var1 == baf.J?var2 + String.format("%.3f bpp", new Object[]{Float.valueOf(bvb.c(var4))}):(var4 == 0.0F?var2 + bsc.a("options.off", new Object[0]):var2 + (int)(var4 * 100.0F) + "%")))))))))))))));
      } else if(var1.b()) {
         boolean var31 = this.b(var1);
         return var31?var2 + bsc.a("options.on", new Object[0]):var2 + bsc.a("options.off", new Object[0]);
      } else if(var1 == baf.l) {
         return var2 + bsc.a(this.av.b(), new Object[0]);
      } else if(var1 == baf.o) {
         return var2 + a(aQ, this.aJ);
      } else if(var1 == baf.r) {
         return var2 + bsc.a(this.m.b(), new Object[0]);
      } else if(var1 == baf.q) {
         return var2 + a(aR, this.aK);
      } else if(var1 == baf.n) {
         return var2 + a(aS, this.j);
      } else if(var1 == baf.O) {
         return var2 + a(aT, this.P);
      } else if(var1 == baf.Q) {
         return var2 + a(aU, this.S);
      } else if(var1 == baf.R) {
         return var2 + a(aV, this.T);
      } else if(var1 == baf.S) {
         return var2 + a(aW, this.U);
      } else if(var1 == baf.m) {
         if(this.i) {
            return var2 + bsc.a("options.graphics.fancy", new Object[0]);
         } else {
            String var3 = "options.graphics.fast";
            return var2 + bsc.a("options.graphics.fast", new Object[0]);
         }
      } else {
         return var2;
      }
   }

   public void a() {
      try {
         if(!this.aY.exists()) {
            return;
         }

         BufferedReader var9 = new BufferedReader(new FileReader(this.aY));
         String var2 = "";
         this.aX.clear();

         while((var2 = var9.readLine()) != null) {
            try {
               String[] var8 = var2.split(":");
               if(var8[0].equals("mouseSensitivity")) {
                  this.a = this.a(var8[1]);
               }

               if(var8[0].equals("fov")) {
                  this.aG = this.a(var8[1]);
               }

               if(var8[0].equals("gamma")) {
                  this.aH = this.a(var8[1]);
               }

               if(var8[0].equals("zoom")) {
                  zoomSetting = this.a(var8[1]);
               }

               if(var8[0].equals("saturation")) {
                  this.aI = this.a(var8[1]);
               }

               if(var8[0].equals("invertYMouse")) {
                  this.b = var8[1].equals("true");
               }

               if(var8[0].equals("renderDistance")) {
                  this.c = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("guiScale")) {
                  this.aJ = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("particles")) {
                  this.aK = Integer.parseInt(var8[1]);
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
                  this.av = pu.a(Integer.parseInt(var8[1]));
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
                  this.l = (List)aO.fromJson(var2.substring(var2.indexOf(58) + 1), aP);
                  if(this.l == null) {
                     this.l = new ArrayList();
                  }
               }

               if(var8[0].equals("lastServer") && var8.length >= 2) {
                  this.aA = var2.substring(var2.indexOf(58) + 1);
               }

               if(var8[0].equals("lang") && var8.length >= 2) {
                  this.aL = var8[1];
               }

               if(var8[0].equals("chatVisibility")) {
                  this.m = xs.a(Integer.parseInt(var8[1]));
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

               if(var8[0].equals("streamBytesPerPixel")) {
                  this.K = this.a(var8[1]);
               }

               if(var8[0].equals("streamMicVolume")) {
                  this.L = this.a(var8[1]);
               }

               if(var8[0].equals("streamSystemVolume")) {
                  this.M = this.a(var8[1]);
               }

               if(var8[0].equals("streamKbps")) {
                  this.N = this.a(var8[1]);
               }

               if(var8[0].equals("streamFps")) {
                  this.O = this.a(var8[1]);
               }

               if(var8[0].equals("streamCompression")) {
                  this.P = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("streamSendMetadata")) {
                  this.Q = var8[1].equals("true");
               }

               if(var8[0].equals("streamPreferredServer") && var8.length >= 2) {
                  this.R = var2.substring(var2.indexOf(58) + 1);
               }

               if(var8[0].equals("streamChatEnabled")) {
                  this.S = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("streamChatUserFilter")) {
                  this.T = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("streamMicToggleBehavior")) {
                  this.U = Integer.parseInt(var8[1]);
               }

               if(var8[0].equals("forceUnicodeFont")) {
                  this.aM = var8[1].equals("true");
               }

               azf[] var4 = this.at;
               int var5 = var4.length;

               int var6;
               for(var6 = 0; var6 < var5; ++var6) {
                  azf var10 = var4[var6];
                  if(var8[0].equals("key_" + var10.g())) {
                     var10.b(Integer.parseInt(var8[1]));
                  }
               }

               w var10000 = this.wubwub;
               w[] var111 = w.values();
               var5 = var111.length;

               for(var6 = 0; var6 < var5; ++var6) {
                  w var11 = var111[var6];
                  if(var8[0].equals("soundCategory_" + var11.a())) {
                     this.aX.put(var11, Float.valueOf(this.a(var8[1])));
                  }
               }
            } catch (Exception var91) {
               aN.warn("Skipping bad option: " + var2);
            }
         }

         azf.b();
         var9.close();
      } catch (Exception var101) {
         aN.error("Failed to load options", var101);
      }

   }

   private float a(String var1) {
      return var1.equals("true")?1.0F:(var1.equals("false")?0.0F:Float.parseFloat(var1));
   }

   public void b() {
      try {
         PrintWriter var6 = new PrintWriter(new FileWriter(this.aY));
         var6.println("invertYMouse:" + this.b);
         var6.println("mouseSensitivity:" + this.a);
         var6.println("fov:" + this.aG);
         var6.println("gamma:" + this.aH);
         var6.println("zoom:" + zoomSetting);
         var6.println("saturation:" + this.aI);
         var6.println("renderDistance:" + this.c);
         var6.println("guiScale:" + this.aJ);
         var6.println("particles:" + this.aK);
         var6.println("bobView:" + this.d);
         var6.println("anaglyph3d:" + this.e);
         var6.println("advancedOpengl:" + this.f);
         var6.println("maxFps:" + this.h);
         var6.println("fboEnable:" + this.g);
         var6.println("difficulty:" + this.av.a());
         var6.println("fancyGraphics:" + this.i);
         var6.println("ao:" + this.j);
         var6.println("clouds:" + this.k);
         var6.println("resourcePacks:" + aO.toJson(this.l));
         var6.println("lastServer:" + this.aA);
         var6.println("lang:" + this.aL);
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
         var6.println("streamBytesPerPixel:" + this.K);
         var6.println("streamMicVolume:" + this.L);
         var6.println("streamSystemVolume:" + this.M);
         var6.println("streamKbps:" + this.N);
         var6.println("streamFps:" + this.O);
         var6.println("streamCompression:" + this.P);
         var6.println("streamSendMetadata:" + this.Q);
         var6.println("streamPreferredServer:" + this.R);
         var6.println("streamChatEnabled:" + this.S);
         var6.println("streamChatUserFilter:" + this.T);
         var6.println("streamMicToggleBehavior:" + this.U);
         var6.println("forceUnicodeFont:" + this.aM);
         azf[] var2 = this.at;
         int var3 = var2.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            azf var7 = var2[var4];
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
         aN.error("Failed to save options", var71);
      }

      this.c();
   }

   public float a(w var1) {
      return this.aX.containsKey(var1)?((Float)this.aX.get(var1)).floatValue():1.0F;
   }

   public void a(w var1, float var2) {
      this.au.X().a(var1, var2);
      this.aX.put(var1, Float.valueOf(var2));
   }

   public void c() {
      if(this.au.h != null) {
         this.au.h.a.a(new il(this.aL, this.c, this.m, this.n, this.av, this.y));
      }

   }

   public boolean d() {
      return this.c >= 4 && this.k;
   }

}
