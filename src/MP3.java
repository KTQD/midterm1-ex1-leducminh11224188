public class MP3 extends Item {
  private int duration;

  public MP3(String name, String description, String ID, float price, int duration){
    super(name,description,ID,price);
    this.duration = duration;
  }

  public int getDuration(){
    return duration;
  }

  public void setDuration(int duration){
    this.duration = duration;
  }
}
