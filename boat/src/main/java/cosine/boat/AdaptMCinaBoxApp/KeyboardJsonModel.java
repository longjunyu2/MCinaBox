package cosine.boat.AdaptMCinaBoxApp;

//为避免循环依赖,且顾及到前后端适配的可扩展性
//需要copy一份adapt包保持对象的一致性

public class KeyboardJsonModel {
    private String KeyName;
    private int KeySizeH;
    private int KeySizeW;
    private int KeyAlpha;
    private int KeyLX;
    private int KeyLY;
    private String KeyMain;
    private String SpecialOne;
    private String SpecialTwo;
    private boolean isAutoKeep;
    private boolean isHide;
    private boolean isMult;
    private String shape;
    private int MainPos;
    private int SpecialOnePos;
    private int SpecialTwoPos;
    private String colorhex;
    private String TextColorHex;
    private int cornerRadius;

    public KeyboardJsonModel(){
        super();
    }

    public KeyboardJsonModel(String keyName, int keySizeW,int keySizeH, int keyAlpha, int keyLX, int keyLY, String keyMain, String specialOne, String specialTwo, boolean isAutoKeep, boolean isHide, boolean isMult, String shape, int mainPos, int specialOnePos, int specialTwoPos,String colorhex,int radius) {
        super();
        KeyName = keyName;
        KeySizeH = keySizeH;
        KeySizeW = keySizeW;
        KeyAlpha = keyAlpha;
        KeyLX = keyLX;
        KeyLY = keyLY;
        KeyMain = keyMain;
        SpecialOne = specialOne;
        SpecialTwo = specialTwo;
        this.isAutoKeep = isAutoKeep;
        this.isHide = isHide;
        this.isMult = isMult;
        this.shape = shape;
        MainPos = mainPos;
        SpecialOnePos = specialOnePos;
        SpecialTwoPos = specialTwoPos;
        this.colorhex = colorhex;
        cornerRadius = radius;
        //TextColorHex = textColorHex;
    }

    public int getKeySizeH() { return KeySizeH; }

    public void setKeySizeH(int keySizeH) { KeySizeH = keySizeH; }

    public String getTextColorHex() { return TextColorHex; }

    public void setTextColorHex(String textColorHex) { TextColorHex = textColorHex; }

    public int getCornerRadius() { return cornerRadius; }

    public void setCornerRadius(int cornerRadius) { this.cornerRadius = cornerRadius; }

    public String getKeyName() {
        return KeyName;
    }

    public void setKeyName(String keyName) {
        KeyName = keyName;
    }

    public int getKeySizeW() {
        return KeySizeW;
    }

    public void setKeySizeW(int keySizeW) {
        KeySizeW = keySizeW;
    }

    public int getKeyAlpha() {
        return KeyAlpha;
    }

    public void setKeyAlpha(int keyAlpha) {
        KeyAlpha = keyAlpha;
    }

    public int getKeyLX() {
        return KeyLX;
    }

    public void setKeyLX(int keyLX) {
        KeyLX = keyLX;
    }

    public int getKeyLY() {
        return KeyLY;
    }

    public void setKeyLY(int keyLY) {
        KeyLY = keyLY;
    }

    public String getKeyMain() {
        return KeyMain;
    }

    public void setKeyMain(String keyMain) {
        KeyMain = keyMain;
    }

    public String getSpecialOne() {
        return SpecialOne;
    }

    public void setSpecialOne(String specialOne) {
        SpecialOne = specialOne;
    }

    public String getSpecialTwo() {
        return SpecialTwo;
    }

    public void setSpecialTwo(String specialTwo) {
        SpecialTwo = specialTwo;
    }

    public boolean isAutoKeep() {
        return isAutoKeep;
    }

    public void setAutoKeep(boolean autoKeep) {
        isAutoKeep = autoKeep;
    }

    public boolean isHide() {
        return isHide;
    }

    public void setHide(boolean hide) {
        isHide = hide;
    }

    public boolean isMult() {
        return isMult;
    }

    public void setMult(boolean mult) {
        isMult = mult;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getMainPos() {
        return MainPos;
    }

    public void setMainPos(int mainPos) {
        MainPos = mainPos;
    }

    public int getSpecialOnePos() {
        return SpecialOnePos;
    }

    public void setSpecialOnePos(int specialOnePos) {
        SpecialOnePos = specialOnePos;
    }

    public int getSpecialTwoPos() {
        return SpecialTwoPos;
    }

    public void setSpecialTwoPos(int specialTwoPos) {
        SpecialTwoPos = specialTwoPos;
    }

    public String getColorhex() { return colorhex; }

    public void setColorhex(String colorhex) { this.colorhex = colorhex; }
}
