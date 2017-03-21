
public class Grape {
  private String mFlavor;
  private String mSize;
  private int mSoftness;
  private String mColor;
  private String mOrigin;

  public Grape(String flavor, String size, int softness, String color, String origin) {
    mFlavor = flavor;
    mSize = size;
    mSoftness = softness;
    mColor = color;
    mOrigin = origin;
  }

  public String getFlavor(){
    return mFlavor;
  }

  public String getSize() {
    return mSize;
  }

  public int getSoftness() {
    return mSoftness;
  }

  public String getColor() {
    return mColor;
  }

  public String getOrigin() {
    return mOrigin;
  }
}
