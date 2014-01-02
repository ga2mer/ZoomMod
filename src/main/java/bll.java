import com.google.gson.JsonSyntaxException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class bll implements bqq {

   private static final Logger q = LogManager.getLogger();
   private static final bqo r = new bqo("textures/environment/rain.png");
   private static final bqo s = new bqo("textures/environment/snow.png");
   public static boolean a;
   public static int b;
   private azd t;
   private float u;
   public final blq c;
   private final baj v;
   private int w;
   private qn x;
   private oz y = new oz();
   private oz z = new oz();
   private oz A = new oz();
   private oz B = new oz();
   private oz C = new oz();
   private oz D = new oz();
   private float E = 4.0F;
   private float F = 4.0F;
   private float G;
   private float H;
   private float I;
   private float J;
   private float K;
   private float L;
   private float M;
   private float N;
   private float O;
   private float P;
   private float Q;
   private float R;
   private float S;
   private final bpi T;
   private final int[] U;
   private final bqo V;
   private float W;
   private float X;
   private float Y;
   private float Z;
   private float aa;
   private boolean ab;
   private final bqp ac;
   public bpb d;
   private static final bqo[] ad = new bqo[]{new bqo("shaders/post/fxaa.json"), new bqo("shaders/post/art.json"), new bqo("shaders/post/bumpy.json"), new bqo("shaders/post/blobs2.json"), new bqo("shaders/post/pencil.json"), new bqo("shaders/post/color_convolve.json"), new bqo("shaders/post/deconverge.json"), new bqo("shaders/post/flip.json"), new bqo("shaders/post/invert.json"), new bqo("shaders/post/ntsc.json"), new bqo("shaders/post/outline.json"), new bqo("shaders/post/phosphor.json"), new bqo("shaders/post/scan_pincushion.json"), new bqo("shaders/post/sobel.json"), new bqo("shaders/post/bits.json"), new bqo("shaders/post/desaturate.json"), new bqo("shaders/post/green.json"), new bqo("shaders/post/blur.json"), new bqo("shaders/post/wobble.json"), new bqo("shaders/post/blobs.json"), new bqo("shaders/post/antialias.json")};
   public static final int e = ad.length;
   private int ae;
   private double af;
   private double ag;
   private double ah;
   private long ai;
   private long aj;
   private boolean ak;
   float f;
   float g;
   float h;
   float i;
   private Random al;
   private int am;
   float[] j;
   float[] k;
   FloatBuffer l;
   float m;
   float n;
   float o;
   private float an;
   private float ao;
   public int p;


   public bll(azd var1, bqp var2) {
      this.ae = e;
      this.af = 1.0D;
      this.ai = azd.J();
      this.al = new Random();
      this.l = azc.h(16);
      this.t = var1;
      this.ac = var2;
      this.v = new baj(var1.N());
      this.c = new blq(var1);
      this.T = new bpi(16, 16);
      this.V = var1.N().a("lightMap", this.T);
      this.U = this.T.d();
      this.d = null;
   }

   public boolean a() {
      return bul.g && this.d != null;
   }

   public void b() {
      if(this.d != null) {
         this.d.a();
      }

      this.d = null;
      this.ae = e;
   }

   public void c() {
      if(bul.g) {
         if(this.d != null) {
            this.d.a();
         }

         this.ae = (this.ae + 1) % (ad.length + 1);
         if(this.ae != e) {
            try {
               q.info("Selecting effect " + ad[this.ae]);
               this.d = new bpb(this.ac, this.t.a(), ad[this.ae]);
               this.d.a(this.t.d, this.t.e);
            } catch (JsonSyntaxException var2) {
               q.warn("Failed to load shader: " + ad[this.ae], var2);
               this.ae = e;
            }
         } else {
            this.d = null;
            q.info("No effect selected");
         }
      }

   }

   public void a(bqp var1) {
      if(this.d != null) {
         this.d.a();
      }

      if(this.ae != e) {
         this.d = new bpb(var1, this.t.a(), ad[this.ae]);
         this.d.a(this.t.d, this.t.e);
      }

   }

   public void d() {
      if(bul.g && bpf.b() == null) {
         bpf.a();
      }

      this.j();
      this.k();
      this.an = this.ao;
      this.F = this.E;
      this.H = this.G;
      this.J = this.I;
      this.Q = this.P;
      this.S = this.R;
      float var1;
      float var2;
      if(this.t.u.am) {
         var1 = this.t.u.a * 0.6F + 0.2F;
         var2 = var1 * var1 * var1 * 8.0F;
         this.M = this.y.a(this.K, 0.05F * var2);
         this.N = this.z.a(this.L, 0.05F * var2);
         this.O = 0.0F;
         this.K = 0.0F;
         this.L = 0.0F;
      }

      if(this.t.i == null) {
         this.t.i = this.t.h;
      }

      var1 = this.t.f.n(ou.c(this.t.i.t), ou.c(this.t.i.u), ou.c(this.t.i.v));
      var2 = (float)(this.t.u.c / 16);
      float var3 = var1 * (1.0F - var2) + var2;
      this.ao += (var3 - this.ao) * 0.1F;
      ++this.w;
      this.c.a();
      this.l();
      this.aa = this.Z;
      if(blf.d) {
         this.Z += 0.05F;
         if(this.Z > 1.0F) {
            this.Z = 1.0F;
         }

         blf.d = false;
      } else if(this.Z > 0.0F) {
         this.Z -= 0.0125F;
      }

   }

   public bpb e() {
      return this.d;
   }

   public void a(int var1, int var2) {
      if(bul.g && this.d != null) {
         this.d.a(var1, var2);
      }

   }

   public void a(float var1) {
      if(this.t.i != null && this.t.f != null) {
         this.t.j = null;
         double var2 = (double)this.t.c.d();
         this.t.t = this.t.i.a(var2, var1);
         double var4 = var2;
         ayk var6 = this.t.i.l(var1);
         if(this.t.c.i()) {
            var2 = 6.0D;
            var4 = 6.0D;
         } else {
            if(var2 > 3.0D) {
               var4 = 3.0D;
            }

            var2 = var4;
         }

         if(this.t.t != null) {
            var4 = this.t.t.f.d(var6);
         }

         ayk var7 = this.t.i.j(var1);
         ayk var8 = var6.c(var7.c * var2, var7.d * var2, var7.e * var2);
         this.x = null;
         ayk var9 = null;
         float var10 = 1.0F;
         List var11 = this.t.f.b(this.t.i, this.t.i.D.a(var7.c * var2, var7.d * var2, var7.e * var2).b((double)var10, (double)var10, (double)var10));
         double var12 = var4;

         for(int var14 = 0; var14 < var11.size(); ++var14) {
            qn var15 = (qn)var11.get(var14);
            if(var15.R()) {
               float var16 = var15.af();
               ayf var17 = var15.D.b((double)var16, (double)var16, (double)var16);
               ayi var18 = var17.a(var6, var8);
               if(var17.a(var6)) {
                  if(0.0D < var12 || var12 == 0.0D) {
                     this.x = var15;
                     var9 = var18 == null?var6:var18.f;
                     var12 = 0.0D;
                  }
               } else if(var18 != null) {
                  double var19 = var6.d(var18.f);
                  if(var19 < var12 || var12 == 0.0D) {
                     if(var15 == this.t.i.n) {
                        if(var12 == 0.0D) {
                           this.x = var15;
                           var9 = var18.f;
                        }
                     } else {
                        this.x = var15;
                        var9 = var18.f;
                        var12 = var19;
                     }
                  }
               }
            }
         }

         if(this.x != null && (var12 < var4 || this.t.t == null)) {
            this.t.t = new ayi(this.x, var9);
            if(this.x instanceof rh || this.x instanceof rf) {
               this.t.j = this.x;
            }
         }
      }

   }

   private void j() {
      blc var1 = (blc)this.t.i;
      this.Y = var1.v();
      this.X = this.W;
      this.W += (this.Y - this.W) * 0.5F;
      if(this.W > 1.5F) {
         this.W = 1.5F;
      }

      if(this.W < 0.1F) {
         this.W = 0.1F;
      }

   }

   private float a(float var1, boolean var2) {
      if(this.p > 0) {
         return 90.0F;
      } else {
         xl var3 = (xl)this.t.i;
         float var4 = 70.0F;
         if(var2) {
            var4 += this.t.u.aq * 40.0F;
            var4 *= this.X + (this.W - this.X) * var1;
         }

         boolean zoomActive = false;
         if(this.t.n == null) {
            if(azw.aabb.i() < 0) {
               zoomActive = Mouse.isButtonDown(azw.aabb.i() + 100);
            } else {
               zoomActive = Keyboard.isKeyDown(azw.aabb.i());
            }
         }

         if(zoomActive) {
            if(!Config.zoomMode) {
               Config.zoomMode = true;
               this.t.u.am = true;
            }

            if(Config.zoomMode) {
               var4 /= azw.zoomSetting;
            }
         } else if(Config.zoomMode) {
            Config.zoomMode = false;
            this.t.u.am = false;
            this.y = new oz();
            this.z = new oz();
         }

         if(var3.aS() <= 0.0F) {
            float var6 = (float)var3.aB + var1;
            var4 /= (1.0F - 500.0F / (var6 + 500.0F)) * 2.0F + 1.0F;
         }

         ahu var61 = ayy.a(this.t.f, var3, var1);
         if(var61.o() == avf.h) {
            var4 = var4 * 60.0F / 70.0F;
         }

         return var4 + this.Q + (this.P - this.Q) * var1;
      }
   }

   private void e(float var1) {
      rh var2 = this.t.i;
      float var3 = (float)var2.ay - var1;
      float var4;
      if(var2.aS() <= 0.0F) {
         var4 = (float)var2.aB + var1;
         GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }

      if(var3 >= 0.0F) {
         var3 /= (float)var2.az;
         var3 = ou.a(var3 * var3 * var3 * var3 * 3.1415927F);
         var4 = var2.aA;
         GL11.glRotatef(-var4, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
      }

   }

   private void f(float var1) {
      if(this.t.i instanceof xl) {
         xl var2 = (xl)this.t.i;
         float var3 = var2.Q - var2.P;
         float var4 = -(var2.Q + var3 * var1);
         float var5 = var2.bs + (var2.bt - var2.bs) * var1;
         float var6 = var2.aJ + (var2.aK - var2.aJ) * var1;
         GL11.glTranslatef(ou.a(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(ou.b(var4 * 3.1415927F) * var5), 0.0F);
         GL11.glRotatef(ou.a(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(Math.abs(ou.b(var4 * 3.1415927F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }

   }

   private void g(float var1) {
      rh var2 = this.t.i;
      float var3 = var2.M - 1.62F;
      double var4 = var2.q + (var2.t - var2.q) * (double)var1;
      double var6 = var2.r + (var2.u - var2.r) * (double)var1 - (double)var3;
      double var8 = var2.s + (var2.v - var2.s) * (double)var1;
      GL11.glRotatef(this.S + (this.R - this.S) * var1, 0.0F, 0.0F, 1.0F);
      if(var2.bm()) {
         var3 = (float)((double)var3 + 1.0D);
         GL11.glTranslatef(0.0F, 0.3F, 0.0F);
         if(!this.t.u.an) {
            ahu var27 = this.t.f.a(ou.c(var2.t), ou.c(var2.u), ou.c(var2.v));
            if(var27 == ahz.C) {
               int var11 = this.t.f.e(ou.c(var2.t), ou.c(var2.u), ou.c(var2.v));
               int var13 = var11 & 3;
               GL11.glRotatef((float)(var13 * 90), 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.B + (var2.z - var2.B) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
            GL11.glRotatef(var2.C + (var2.A - var2.C) * var1, -1.0F, 0.0F, 0.0F);
         }
      } else if(this.t.u.ah > 0) {
         double var271 = (double)(this.F + (this.E - this.F) * var1);
         float var28;
         float var281;
         if(this.t.u.an) {
            var28 = this.H + (this.G - this.H) * var1;
            var281 = this.J + (this.I - this.J) * var1;
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var271));
            GL11.glRotatef(var281, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var28, 0.0F, 1.0F, 0.0F);
         } else {
            var28 = var2.z;
            var281 = var2.A;
            if(this.t.u.ah == 2) {
               var281 += 180.0F;
            }

            double var14 = (double)(-ou.a(var28 / 180.0F * 3.1415927F) * ou.b(var281 / 180.0F * 3.1415927F)) * var271;
            double var16 = (double)(ou.b(var28 / 180.0F * 3.1415927F) * ou.b(var281 / 180.0F * 3.1415927F)) * var271;
            double var18 = (double)(-ou.a(var281 / 180.0F * 3.1415927F)) * var271;

            for(int var20 = 0; var20 < 8; ++var20) {
               float var21 = (float)((var20 & 1) * 2 - 1);
               float var22 = (float)((var20 >> 1 & 1) * 2 - 1);
               float var23 = (float)((var20 >> 2 & 1) * 2 - 1);
               var21 *= 0.1F;
               var22 *= 0.1F;
               var23 *= 0.1F;
               ayi var24 = this.t.f.a(this.t.f.U().a(var4 + (double)var21, var6 + (double)var22, var8 + (double)var23), this.t.f.U().a(var4 - var14 + (double)var21 + (double)var23, var6 - var18 + (double)var22, var8 - var16 + (double)var23));
               if(var24 != null) {
                  double var25 = var24.f.d(this.t.f.U().a(var4, var6, var8));
                  if(var25 < var271) {
                     var271 = var25;
                  }
               }
            }

            if(this.t.u.ah == 2) {
               GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.A - var281, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var2.z - var28, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var271));
            GL11.glRotatef(var28 - var2.z, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var281 - var2.A, 1.0F, 0.0F, 0.0F);
         }
      } else {
         GL11.glTranslatef(0.0F, 0.0F, -0.1F);
      }

      if(!this.t.u.an) {
         GL11.glRotatef(var2.C + (var2.A - var2.C) * var1, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var2.B + (var2.z - var2.B) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
      }

      GL11.glTranslatef(0.0F, var3, 0.0F);
      var4 = var2.q + (var2.t - var2.q) * (double)var1;
      var6 = var2.r + (var2.u - var2.r) * (double)var1 - (double)var3;
      var8 = var2.s + (var2.v - var2.s) * (double)var1;
      this.ab = this.t.g.a(var4, var6, var8, var1);
   }

   private void a(float var1, int var2) {
      this.u = (float)(this.t.u.c * 16);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float var3 = 0.07F;
      if(this.t.u.e) {
         GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
      }

      if(this.af != 1.0D) {
         GL11.glTranslatef((float)this.ag, (float)(-this.ah), 0.0F);
         GL11.glScaled(this.af, this.af, 1.0D);
      }

      Project.gluPerspective(this.a(var1, true), (float)this.t.d / (float)this.t.e, 0.05F, this.u * 2.0F);
      float var4;
      if(this.t.c.a()) {
         var4 = 0.6666667F;
         GL11.glScalef(1.0F, var4, 1.0F);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if(this.t.u.e) {
         GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.e(var1);
      if(this.t.u.d) {
         this.f(var1);
      }

      var4 = this.t.h.bN + (this.t.h.bM - this.t.h.bN) * var1;
      if(var4 > 0.0F) {
         byte var7 = 20;
         if(this.t.h.a(qi.k)) {
            var7 = 7;
         }

         float var6 = 5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F;
         var6 *= var6;
         GL11.glRotatef(((float)this.w + var1) * (float)var7, 0.0F, 1.0F, 1.0F);
         GL11.glScalef(1.0F / var6, 1.0F, 1.0F);
         GL11.glRotatef(-((float)this.w + var1) * (float)var7, 0.0F, 1.0F, 1.0F);
      }

      this.g(var1);
      if(this.p > 0) {
         int var71 = this.p - 1;
         if(var71 == 1) {
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var71 == 2) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var71 == 3) {
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var71 == 4) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         }

         if(var71 == 5) {
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         }
      }

   }

   private void b(float var1, int var2) {
      if(this.p <= 0) {
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         float var3 = 0.07F;
         if(this.t.u.e) {
            GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
         }

         if(this.af != 1.0D) {
            GL11.glTranslatef((float)this.ag, (float)(-this.ah), 0.0F);
            GL11.glScaled(this.af, this.af, 1.0D);
         }

         Project.gluPerspective(this.a(var1, false), (float)this.t.d / (float)this.t.e, 0.05F, this.u * 2.0F);
         if(this.t.c.a()) {
            float var4 = 0.6666667F;
            GL11.glScalef(1.0F, var4, 1.0F);
         }

         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         if(this.t.u.e) {
            GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
         }

         GL11.glPushMatrix();
         this.e(var1);
         if(this.t.u.d) {
            this.f(var1);
         }

         if(this.t.u.ah == 0 && !this.t.i.bm() && !this.t.u.ag && !this.t.c.a()) {
            this.b((double)var1);
            this.c.a(var1);
            this.a((double)var1);
         }

         GL11.glPopMatrix();
         if(this.t.u.ah == 0 && !this.t.i.bm()) {
            this.c.b(var1);
            this.e(var1);
         }

         if(this.t.u.d) {
            this.f(var1);
         }
      }

   }

   public void a(double var1) {
      bul.a(bul.c);
      GL11.glDisable(3553);
      bul.a(bul.b);
   }

   public void b(double var1) {
      bul.a(bul.c);
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      float var3 = 0.00390625F;
      GL11.glScalef(var3, var3, var3);
      GL11.glTranslatef(8.0F, 8.0F, 8.0F);
      GL11.glMatrixMode(5888);
      this.t.N().a(this.V);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      bul.a(bul.b);
   }

   private void k() {
      this.g = (float)((double)this.g + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.i = (float)((double)this.i + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.g = (float)((double)this.g * 0.9D);
      this.i = (float)((double)this.i * 0.9D);
      this.f += (this.g - this.f) * 1.0F;
      this.h += (this.i - this.h) * 1.0F;
      this.ak = true;
   }

   private void h(float var1) {
      biz var2 = this.t.f;
      if(var2 != null) {
         for(int var3 = 0; var3 < 256; ++var3) {
            float var4 = var2.b(1.0F) * 0.95F + 0.05F;
            float var5 = var2.t.h[var3 / 16] * var4;
            float var6 = var2.t.h[var3 % 16] * (this.f * 0.1F + 1.5F);
            if(var2.q > 0) {
               var5 = var2.t.h[var3 / 16];
            }

            float var7 = var5 * (var2.b(1.0F) * 0.65F + 0.35F);
            float var8 = var5 * (var2.b(1.0F) * 0.65F + 0.35F);
            float var11 = var6 * ((var6 * 0.6F + 0.4F) * 0.6F + 0.4F);
            float var12 = var6 * (var6 * var6 * 0.6F + 0.4F);
            float var13 = var7 + var6;
            float var14 = var8 + var11;
            float var15 = var5 + var12;
            var13 = var13 * 0.96F + 0.03F;
            var14 = var14 * 0.96F + 0.03F;
            var15 = var15 * 0.96F + 0.03F;
            float var16;
            if(this.Z > 0.0F) {
               var16 = this.aa + (this.Z - this.aa) * var1;
               var13 = var13 * (1.0F - var16) + var13 * 0.7F * var16;
               var14 = var14 * (1.0F - var16) + var14 * 0.6F * var16;
               var15 = var15 * (1.0F - var16) + var15 * 0.6F * var16;
            }

            if(var2.t.i == 1) {
               var13 = 0.22F + var6 * 0.75F;
               var14 = 0.28F + var11 * 0.75F;
               var15 = 0.25F + var12 * 0.75F;
            }

            float var17;
            if(this.t.h.a(qi.r)) {
               var16 = this.a((xl)this.t.h, var1);
               var17 = 1.0F / var13;
               if(var17 > 1.0F / var14) {
                  var17 = 1.0F / var14;
               }

               if(var17 > 1.0F / var15) {
                  var17 = 1.0F / var15;
               }

               var13 = var13 * (1.0F - var16) + var13 * var17 * var16;
               var14 = var14 * (1.0F - var16) + var14 * var17 * var16;
               var15 = var15 * (1.0F - var16) + var15 * var17 * var16;
            }

            if(var13 > 1.0F) {
               var13 = 1.0F;
            }

            if(var14 > 1.0F) {
               var14 = 1.0F;
            }

            if(var15 > 1.0F) {
               var15 = 1.0F;
            }

            var16 = this.t.u.ar;
            var17 = 1.0F - var13;
            float var18 = 1.0F - var14;
            float var19 = 1.0F - var15;
            var17 = 1.0F - var17 * var17 * var17 * var17;
            var18 = 1.0F - var18 * var18 * var18 * var18;
            var19 = 1.0F - var19 * var19 * var19 * var19;
            var13 = var13 * (1.0F - var16) + var17 * var16;
            var14 = var14 * (1.0F - var16) + var18 * var16;
            var15 = var15 * (1.0F - var16) + var19 * var16;
            var13 = var13 * 0.96F + 0.03F;
            var14 = var14 * 0.96F + 0.03F;
            var15 = var15 * 0.96F + 0.03F;
            if(var13 > 1.0F) {
               var13 = 1.0F;
            }

            if(var14 > 1.0F) {
               var14 = 1.0F;
            }

            if(var15 > 1.0F) {
               var15 = 1.0F;
            }

            if(var13 < 0.0F) {
               var13 = 0.0F;
            }

            if(var14 < 0.0F) {
               var14 = 0.0F;
            }

            if(var15 < 0.0F) {
               var15 = 0.0F;
            }

            short var20 = 255;
            int var21 = (int)(var13 * 255.0F);
            int var22 = (int)(var14 * 255.0F);
            int var23 = (int)(var15 * 255.0F);
            this.U[var3] = var20 << 24 | var21 << 16 | var22 << 8 | var23;
         }

         this.T.a();
         this.ak = false;
      }

   }

   private float a(xl var1, float var2) {
      int var3 = var1.b(qi.r).b();
      return var3 > 200?1.0F:0.7F + ou.a(((float)var3 - var2) * 3.1415927F * 0.2F) * 0.3F;
   }

   public void b(float var1) {
      this.t.A.a("lightTex");
      if(this.ak) {
         this.h(var1);
      }

      this.t.A.b();
      boolean var2 = Display.isActive();
      if(!var2 && this.t.u.x && (!this.t.u.z || !Mouse.isButtonDown(1))) {
         if(azd.J() - this.ai > 500L) {
            this.t.m();
         }
      } else {
         this.ai = azd.J();
      }

      this.t.A.a("mouse");
      if(this.t.y && var2) {
         this.t.v.c();
         float var13 = this.t.u.a * 0.6F + 0.2F;
         float var14 = var13 * var13 * var13 * 8.0F;
         float var15 = (float)this.t.v.a * var14;
         float var16 = (float)this.t.v.b * var14;
         byte var18 = 1;
         if(this.t.u.b) {
            var18 = -1;
         }

         if(this.t.u.am) {
            this.K += var15;
            this.L += var16;
            float var17 = var1 - this.O;
            this.O = var1;
            var15 = this.M * var17;
            var16 = this.N * var17;
            this.t.h.c(var15, var16 * (float)var18);
         } else {
            this.t.h.c(var15, var16 * (float)var18);
         }
      }

      this.t.A.b();
      if(!this.t.s) {
         a = this.t.u.e;
         bam var131 = new bam(this.t.u, this.t.d, this.t.e);
         int var141 = var131.a();
         int var151 = var131.b();
         int var161 = Mouse.getX() * var141 / this.t.d;
         int var181 = var151 - Mouse.getY() * var151 / this.t.e - 1;
         int var171 = this.t.u.h;
         if(this.t.f != null) {
            this.t.A.a("level");
            if(this.t.h()) {
               this.a(var1, this.aj + (long)(1000000000 / var171));
            } else {
               this.a(var1, 0L);
            }

            if(bul.g) {
               if(this.d != null) {
                  GL11.glMatrixMode(5890);
                  GL11.glPushMatrix();
                  GL11.glLoadIdentity();
                  this.d.a(var1);
                  GL11.glPopMatrix();
               }

               this.t.a().a(true);
            }

            this.aj = System.nanoTime();
            this.t.A.c("gui");
            if(!this.t.u.ag || this.t.n != null) {
               GL11.glAlphaFunc(516, 0.1F);
               this.t.r.a(var1, this.t.n != null, var161, var181);
            }

            this.t.A.b();
         } else {
            GL11.glViewport(0, 0, this.t.d, this.t.e);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            this.g();
            this.aj = System.nanoTime();
         }

         if(this.t.n != null) {
            GL11.glClear(256);

            try {
               this.t.n.a(var161, var181, var1);
            } catch (Throwable var10) {
               ;
            }
         }
      }

   }

   public void a(float var1, long var2) {
      this.t.A.a("lightTex");
      if(this.ak) {
         this.h(var1);
      }

      GL11.glEnable(2884);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.5F);
      if(this.t.i == null) {
         this.t.i = this.t.h;
      }

      this.t.A.c("pick");
      this.a(var1);
      rh var4 = this.t.i;
      bls var5 = this.t.g;
      bkg var6 = this.t.k;
      double var7 = var4.T + (var4.t - var4.T) * (double)var1;
      double var9 = var4.U + (var4.u - var4.U) * (double)var1;
      double var11 = var4.V + (var4.v - var4.V) * (double)var1;
      this.t.A.c("center");

      for(int var13 = 0; var13 < 2; ++var13) {
         if(this.t.u.e) {
            b = var13;
            if(b == 0) {
               GL11.glColorMask(false, true, true, false);
            } else {
               GL11.glColorMask(true, false, false, false);
            }
         }

         this.t.A.c("clear");
         GL11.glViewport(0, 0, this.t.d, this.t.e);
         this.i(var1);
         GL11.glClear(16640);
         GL11.glEnable(2884);
         this.t.A.c("camera");
         this.a(var1, var13);
         ayy.a(this.t.h, this.t.u.ah == 2);
         this.t.A.c("frustrum");
         bmo.a();
         if(this.t.u.c >= 4) {
            this.a(-1, var1);
            this.t.A.c("sky");
            var5.a(var1);
         }

         GL11.glEnable(2912);
         this.a(1, var1);
         if(this.t.u.j != 0) {
            GL11.glShadeModel(7425);
         }

         this.t.A.c("culling");
         bmp var14 = new bmp();
         var14.a(var7, var9, var11);
         this.t.g.a(var14, var1);
         if(var13 == 0) {
            this.t.A.c("updatechunks");

            while(!this.t.g.a(var4, false) && var2 != 0L) {
               long var17 = var2 - System.nanoTime();
               if(var17 < 0L || var17 > 1000000000L) {
                  break;
               }
            }
         }

         if(var4.u < 128.0D) {
            this.a(var5, var1);
         }

         this.t.A.c("prepareterrain");
         this.a(0, var1);
         GL11.glEnable(2912);
         this.t.N().a(bpr.b);
         azb.a();
         this.t.A.c("terrain");
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         var5.a(var4, 0, (double)var1);
         GL11.glShadeModel(7424);
         xl var171;
         if(this.p == 0) {
            GL11.glMatrixMode(5888);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            azb.b();
            this.t.A.c("entities");
            var5.a(var4, var14, var1);
            this.b((double)var1);
            this.t.A.c("litParticles");
            var6.b(var4, var1);
            azb.a();
            this.a(0, var1);
            this.t.A.c("particles");
            var6.a(var4, var1);
            this.a((double)var1);
            GL11.glMatrixMode(5888);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            if(this.t.t != null && var4.a(avf.h) && var4 instanceof xl && !this.t.u.ag) {
               var171 = (xl)var4;
               GL11.glDisable(3008);
               this.t.A.c("outline");
               var5.a(var171, this.t.t, 0, var1);
               GL11.glEnable(3008);
            }
         }

         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         if(this.af == 1.0D && var4 instanceof xl && !this.t.u.ag && this.t.t != null && !var4.a(avf.h)) {
            var171 = (xl)var4;
            GL11.glDisable(3008);
            this.t.A.c("outline");
            var5.a(var171, this.t.t, 0, var1);
            GL11.glEnable(3008);
         }

         this.t.A.c("destroyProgress");
         GL11.glEnable(3042);
         bul.a(770, 1, 1, 0);
         var5.a(blz.a, (xl)var4, var1);
         GL11.glDisable(3042);
         GL11.glDepthMask(false);
         GL11.glEnable(2884);
         this.t.A.c("weather");
         this.d(var1);
         GL11.glDepthMask(true);
         GL11.glDisable(3042);
         GL11.glEnable(2884);
         bul.a(770, 771, 1, 0);
         GL11.glAlphaFunc(516, 0.1F);
         this.a(0, var1);
         GL11.glEnable(3042);
         GL11.glDepthMask(false);
         this.t.N().a(bpr.b);
         if(this.t.u.i) {
            this.t.A.c("water");
            if(this.t.u.j != 0) {
               GL11.glShadeModel(7425);
            }

            GL11.glEnable(3042);
            bul.a(770, 771, 1, 0);
            if(this.t.u.e) {
               if(b == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }

               var5.a(var4, 1, (double)var1);
            } else {
               var5.a(var4, 1, (double)var1);
            }

            GL11.glDisable(3042);
            GL11.glShadeModel(7424);
         } else {
            this.t.A.c("water");
            var5.a(var4, 1, (double)var1);
         }

         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         GL11.glDisable(2912);
         if(var4.u >= 128.0D) {
            this.t.A.c("aboveClouds");
            this.a(var5, var1);
         }

         this.t.A.c("hand");
         if(this.af == 1.0D) {
            GL11.glClear(256);
            this.b(var1, var13);
         }

         if(!this.t.u.e) {
            this.t.A.b();
            return;
         }
      }

      GL11.glColorMask(true, true, true, false);
      this.t.A.b();
   }

   private void a(bls var1, float var2) {
      if(this.t.u.d()) {
         this.t.A.c("clouds");
         GL11.glPushMatrix();
         this.a(0, var2);
         GL11.glEnable(2912);
         var1.b(var2);
         GL11.glDisable(2912);
         this.a(1, var2);
         GL11.glPopMatrix();
      }

   }

   private void l() {
      float var1 = this.t.f.j(1.0F);
      if(!this.t.u.i) {
         var1 /= 2.0F;
      }

      if(var1 != 0.0F) {
         this.al.setSeed((long)this.w * 312987231L);
         rh var2 = this.t.i;
         biz var3 = this.t.f;
         int var4 = ou.c(var2.t);
         int var5 = ou.c(var2.u);
         int var6 = ou.c(var2.v);
         byte var7 = 10;
         double var8 = 0.0D;
         double var10 = 0.0D;
         double var12 = 0.0D;
         int var14 = 0;
         int var15 = (int)(100.0F * var1 * var1);
         if(this.t.u.au == 1) {
            var15 >>= 1;
         } else if(this.t.u.au == 2) {
            var15 = 0;
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            int var17 = var4 + this.al.nextInt(var7) - this.al.nextInt(var7);
            int var18 = var6 + this.al.nextInt(var7) - this.al.nextInt(var7);
            int var19 = var3.h(var17, var18);
            ahu var20 = var3.a(var17, var19 - 1, var18);
            agg var21 = var3.a(var17, var18);
            if(var19 <= var5 + var7 && var19 >= var5 - var7 && var21.e() && var21.a(var17, var19, var18) >= 0.15F) {
               float var22 = this.al.nextFloat();
               float var23 = this.al.nextFloat();
               if(var20.o() == avf.i) {
                  this.t.k.a(new bko(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - var20.z(), (double)((float)var18 + var23), 0.0D, 0.0D, 0.0D));
               } else if(var20.o() != avf.a) {
                  ++var14;
                  if(this.al.nextInt(var14) == 0) {
                     var8 = (double)((float)var17 + var22);
                     var10 = (double)((float)var19 + 0.1F) - var20.z();
                     var12 = (double)((float)var18 + var23);
                  }

                  this.t.k.a(new bky(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - var20.z(), (double)((float)var18 + var23)));
               }
            }
         }

         if(var14 > 0 && this.al.nextInt(3) < this.am++) {
            this.am = 0;
            if(var10 > var2.u + 1.0D && var3.h(ou.c(var2.t), ou.c(var2.v)) > ou.c(var2.u)) {
               this.t.f.a(var8, var10, var12, "ambient.weather.rain", 0.1F, 0.5F, false);
            } else {
               this.t.f.a(var8, var10, var12, "ambient.weather.rain", 0.2F, 1.0F, false);
            }
         }
      }

   }

   protected void d(float var1) {
      float var2 = this.t.f.j(var1);
      if(var2 > 0.0F) {
         this.b((double)var1);
         if(this.j == null) {
            this.j = new float[1024];
            this.k = new float[1024];

            for(int var41 = 0; var41 < 32; ++var41) {
               for(int var42 = 0; var42 < 32; ++var42) {
                  float var43 = (float)(var42 - 16);
                  float var44 = (float)(var41 - 16);
                  float var45 = ou.c(var43 * var43 + var44 * var44);
                  this.j[var41 << 5 | var42] = -var44 / var45;
                  this.k[var41 << 5 | var42] = var43 / var45;
               }
            }
         }

         rh var411 = this.t.i;
         biz var421 = this.t.f;
         int var431 = ou.c(var411.t);
         int var441 = ou.c(var411.u);
         int var451 = ou.c(var411.v);
         blz var8 = blz.a;
         GL11.glDisable(2884);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glEnable(3042);
         bul.a(770, 771, 1, 0);
         GL11.glAlphaFunc(516, 0.1F);
         double var9 = var411.T + (var411.t - var411.T) * (double)var1;
         double var11 = var411.U + (var411.u - var411.U) * (double)var1;
         double var13 = var411.V + (var411.v - var411.V) * (double)var1;
         int var15 = ou.c(var11);
         byte var16 = 5;
         if(this.t.u.i) {
            var16 = 10;
         }

         boolean var17 = false;
         byte var18 = -1;
         float var19 = (float)this.w + var1;
         if(this.t.u.i) {
            var16 = 10;
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var17 = false;

         for(int var20 = var451 - var16; var20 <= var451 + var16; ++var20) {
            for(int var21 = var431 - var16; var21 <= var431 + var16; ++var21) {
               int var22 = (var20 - var451 + 16) * 32 + var21 - var431 + 16;
               float var23 = this.j[var22] * 0.5F;
               float var24 = this.k[var22] * 0.5F;
               agg var25 = var421.a(var21, var20);
               if(var25.e() || var25.d()) {
                  int var26 = var421.h(var21, var20);
                  int var27 = var441 - var16;
                  int var28 = var441 + var16;
                  if(var27 < var26) {
                     var27 = var26;
                  }

                  if(var28 < var26) {
                     var28 = var26;
                  }

                  float var29 = 1.0F;
                  int var30 = var26;
                  if(var26 < var15) {
                     var30 = var15;
                  }

                  if(var27 != var28) {
                     this.al.setSeed((long)(var21 * var21 * 3121 + var21 * 45238971 ^ var20 * var20 * 418711 + var20 * 13761));
                     float var31 = var25.a(var21, var27, var20);
                     float var32;
                     double var35;
                     if(var421.u().a(var31, var26) >= 0.15F) {
                        if(var18 != 0) {
                           if(var18 >= 0) {
                              var8.a();
                           }

                           var18 = 0;
                           this.t.N().a(r);
                           var8.b();
                        }

                        var32 = ((float)(this.w + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31) + var1) / 32.0F * (3.0F + this.al.nextFloat());
                        double var46 = (double)((float)var21 + 0.5F) - var411.t;
                        var35 = (double)((float)var20 + 0.5F) - var411.v;
                        float var47 = ou.a(var46 * var46 + var35 * var35) / (float)var16;
                        float var38 = 1.0F;
                        var8.b(var421.c(var21, var30, var20, 0));
                        var8.a(var38, var38, var38, ((1.0F - var47 * var47) * 0.5F + 0.5F) * var2);
                        var8.b(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                        var8.b(0.0D, 0.0D, 0.0D);
                     } else {
                        if(var18 != 1) {
                           if(var18 >= 0) {
                              var8.a();
                           }

                           var18 = 1;
                           this.t.N().a(s);
                           var8.b();
                        }

                        var32 = ((float)(this.w & 511) + var1) / 512.0F;
                        float var461 = this.al.nextFloat() + var19 * 0.01F * (float)this.al.nextGaussian();
                        float var34 = this.al.nextFloat() + var19 * (float)this.al.nextGaussian() * 0.001F;
                        var35 = (double)((float)var21 + 0.5F) - var411.t;
                        double var471 = (double)((float)var20 + 0.5F) - var411.v;
                        float var39 = ou.a(var35 * var35 + var471 * var471) / (float)var16;
                        float var40 = 1.0F;
                        var8.b((var421.c(var21, var30, var20, 0) * 3 + 15728880) / 4);
                        var8.a(var40, var40, var40, ((1.0F - var39 * var39) * 0.3F + 0.5F) * var2);
                        var8.b(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var461), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var34));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var461), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var34));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var461), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var34));
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var461), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var34));
                        var8.b(0.0D, 0.0D, 0.0D);
                     }
                  }
               }
            }
         }

         if(var18 >= 0) {
            var8.a();
         }

         GL11.glEnable(2884);
         GL11.glDisable(3042);
         GL11.glAlphaFunc(516, 0.1F);
         this.a((double)var1);
      }

   }

   public void g() {
      bam var1 = new bam(this.t.u, this.t.d, this.t.e);
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.c(), var1.d(), 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   private void i(float var1) {
      biz var2 = this.t.f;
      rh var3 = this.t.i;
      float var4 = 0.25F + 0.75F * (float)this.t.u.c / 16.0F;
      var4 = 1.0F - (float)Math.pow((double)var4, 0.25D);
      ayk var5 = var2.a(this.t.i, var1);
      float var6 = (float)var5.c;
      float var7 = (float)var5.d;
      float var8 = (float)var5.e;
      ayk var9 = var2.f(var1);
      this.m = (float)var9.c;
      this.n = (float)var9.d;
      this.o = (float)var9.e;
      float var11;
      if(this.t.u.c >= 4) {
         ayk var19 = ou.a(var2.d(var1)) > 0.0F?var2.U().a(-1.0D, 0.0D, 0.0D):var2.U().a(1.0D, 0.0D, 0.0D);
         var11 = (float)var3.j(var1).b(var19);
         if(var11 < 0.0F) {
            var11 = 0.0F;
         }

         if(var11 > 0.0F) {
            float[] var20 = var2.t.a(var2.c(var1), var1);
            if(var20 != null) {
               var11 *= var20[3];
               this.m = this.m * (1.0F - var11) + var20[0] * var11;
               this.n = this.n * (1.0F - var11) + var20[1] * var11;
               this.o = this.o * (1.0F - var11) + var20[2] * var11;
            }
         }
      }

      this.m += (var6 - this.m) * var4;
      this.n += (var7 - this.n) * var4;
      this.o += (var8 - this.o) * var4;
      float var191 = var2.j(var1);
      float var201;
      if(var191 > 0.0F) {
         var11 = 1.0F - var191 * 0.5F;
         var201 = 1.0F - var191 * 0.4F;
         this.m *= var11;
         this.n *= var11;
         this.o *= var201;
      }

      var11 = var2.h(var1);
      if(var11 > 0.0F) {
         var201 = 1.0F - var11 * 0.5F;
         this.m *= var201;
         this.n *= var201;
         this.o *= var201;
      }

      ahu var21 = ayy.a(this.t.f, var3, var1);
      float var22;
      if(this.ab) {
         ayk var14 = var2.e(var1);
         this.m = (float)var14.c;
         this.n = (float)var14.d;
         this.o = (float)var14.e;
      } else if(var21.o() == avf.h) {
         var22 = (float)aeh.b(var3) * 0.2F;
         this.m = 0.02F + var22;
         this.n = 0.02F + var22;
         this.o = 0.2F + var22;
      } else if(var21.o() == avf.i) {
         this.m = 0.6F;
         this.n = 0.1F;
         this.o = 0.0F;
      }

      var22 = this.an + (this.ao - this.an) * var1;
      this.m *= var22;
      this.n *= var22;
      this.o *= var22;
      double var141 = (var3.U + (var3.u - var3.U) * (double)var1) * var2.t.k();
      if(var3.a(qi.q)) {
         int var23 = var3.b(qi.q).b();
         if(var23 < 20) {
            var141 *= (double)(1.0F - (float)var23 / 20.0F);
         } else {
            var141 = 0.0D;
         }
      }

      if(var141 < 1.0D) {
         if(var141 < 0.0D) {
            var141 = 0.0D;
         }

         var141 *= var141;
         this.m = (float)((double)this.m * var141);
         this.n = (float)((double)this.n * var141);
         this.o = (float)((double)this.o * var141);
      }

      float var231;
      if(this.Z > 0.0F) {
         var231 = this.aa + (this.Z - this.aa) * var1;
         this.m = this.m * (1.0F - var231) + this.m * 0.7F * var231;
         this.n = this.n * (1.0F - var231) + this.n * 0.6F * var231;
         this.o = this.o * (1.0F - var231) + this.o * 0.6F * var231;
      }

      float var17;
      if(var3.a(qi.r)) {
         var231 = this.a((xl)this.t.h, var1);
         var17 = 1.0F / this.m;
         if(var17 > 1.0F / this.n) {
            var17 = 1.0F / this.n;
         }

         if(var17 > 1.0F / this.o) {
            var17 = 1.0F / this.o;
         }

         this.m = this.m * (1.0F - var231) + this.m * var17 * var231;
         this.n = this.n * (1.0F - var231) + this.n * var17 * var231;
         this.o = this.o * (1.0F - var231) + this.o * var17 * var231;
      }

      if(this.t.u.e) {
         var231 = (this.m * 30.0F + this.n * 59.0F + this.o * 11.0F) / 100.0F;
         var17 = (this.m * 30.0F + this.n * 70.0F) / 100.0F;
         float var18 = (this.m * 30.0F + this.o * 70.0F) / 100.0F;
         this.m = var231;
         this.n = var17;
         this.o = var18;
      }

      GL11.glClearColor(this.m, this.n, this.o, 0.0F);
   }

   private void a(int var1, float var2) {
      rh var3 = this.t.i;
      boolean var4 = false;
      if(var3 instanceof xl) {
         var4 = ((xl)var3).bF.d;
      }

      if(var1 == 999) {
         GL11.glFog(2918, this.a(0.0F, 0.0F, 0.0F, 1.0F));
         GL11.glFogi(2917, 9729);
         GL11.glFogf(2915, 0.0F);
         GL11.glFogf(2916, 8.0F);
         if(GLContext.getCapabilities().GL_NV_fog_distance) {
            GL11.glFogi('\u855a', '\u855b');
         }

         GL11.glFogf(2915, 0.0F);
      } else {
         GL11.glFog(2918, this.a(this.m, this.n, this.o, 1.0F));
         GL11.glNormal3f(0.0F, -1.0F, 0.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         ahu var5 = ayy.a(this.t.f, var3, var2);
         float var6;
         if(var3.a(qi.q)) {
            var6 = 5.0F;
            int var10 = var3.b(qi.q).b();
            if(var10 < 20) {
               var6 = 5.0F + (this.u - 5.0F) * (1.0F - (float)var10 / 20.0F);
            }

            GL11.glFogi(2917, 9729);
            if(var1 < 0) {
               GL11.glFogf(2915, 0.0F);
               GL11.glFogf(2916, var6 * 0.8F);
            } else {
               GL11.glFogf(2915, var6 * 0.25F);
               GL11.glFogf(2916, var6);
            }

            if(GLContext.getCapabilities().GL_NV_fog_distance) {
               GL11.glFogi('\u855a', '\u855b');
            }
         } else if(this.ab) {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 0.1F);
         } else if(var5.o() == avf.h) {
            GL11.glFogi(2917, 2048);
            if(var3.a(qi.o)) {
               GL11.glFogf(2914, 0.05F);
            } else {
               GL11.glFogf(2914, 0.1F - (float)aeh.b(var3) * 0.03F);
            }
         } else if(var5.o() == avf.i) {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 2.0F);
         } else {
            var6 = this.u;
            if(this.t.f.t.j() && !var4) {
               double var101 = (double)((var3.c(var2) & 15728640) >> 20) / 16.0D + (var3.U + (var3.u - var3.U) * (double)var2 + 4.0D) / 32.0D;
               if(var101 < 1.0D) {
                  if(var101 < 0.0D) {
                     var101 = 0.0D;
                  }

                  var101 *= var101;
                  float var9 = 100.0F * (float)var101;
                  if(var9 < 5.0F) {
                     var9 = 5.0F;
                  }

                  if(var6 > var9) {
                     var6 = var9;
                  }
               }
            }

            GL11.glFogi(2917, 9729);
            if(var1 < 0) {
               GL11.glFogf(2915, 0.0F);
               GL11.glFogf(2916, var6);
            } else {
               GL11.glFogf(2915, var6 * 0.75F);
               GL11.glFogf(2916, var6);
            }

            if(GLContext.getCapabilities().GL_NV_fog_distance) {
               GL11.glFogi('\u855a', '\u855b');
            }

            if(this.t.f.t.b((int)var3.t, (int)var3.v)) {
               GL11.glFogf(2915, var6 * 0.05F);
               GL11.glFogf(2916, Math.min(var6, 192.0F) * 0.5F);
            }
         }

         GL11.glEnable(2903);
         GL11.glColorMaterial(1028, 4608);
      }

   }

   private FloatBuffer a(float var1, float var2, float var3, float var4) {
      this.l.clear();
      this.l.put(var1).put(var2).put(var3).put(var4);
      this.l.flip();
      return this.l;
   }

   public baj i() {
      return this.v;
   }

   static azd a(bll var0) {
      return var0.t;
   }

}
