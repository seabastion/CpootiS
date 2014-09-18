package folder1.folder2;
import java.lang.math;
public class Vehicle{
	//Instance Vars
	private String md;
	private double v, a, d, v0, d0;
	private int t;
	private static int vehicleID;
	//Constructor
	public Vehicle(String model, double veloc, double accel, double dist, int tim){
		this.md=model;
		this.v0 = veloc;
		this.a = accel;
		this.d0 = dist;
		this.t = tim;
		vehicleID++;
	}
	
	//Default Constructor: sets all values to null
	public Vehicle(){ }
	
	//Accessors
	public String getModel(){
		return md;
	}
	public double getVelocity(){
		return v;
	}
	public double getAccel(){
		return a;
	}
	public double getDist(){
		return d;
	}
	public int getTime(){
		return t;
	}
	//Mutators
	public void setModel(String modl){
		md=modl;
	}
	public void setVelocity(double v1){
		v0=v1;
	}
	public void setAccel(double an){
		a=an;
	}
	public void setDist(double dn){
		d0=dn;
	}
	public void setTime(int tn){
		t=tn;
	}
	public String toString(){
		return "Model: "+md+"\nCurrent Vehicle ID: "+vehicleID+"\nFinal Velocity: "+v+" at time t= "+t+"\nDistance: Travelled"+d;
	}
	public void velocity(){
		v=v0+a*t;
	}
	public void distance(){
		d=.5*a*Math.pow(t,2)+v0*t+d0;
	}
}
