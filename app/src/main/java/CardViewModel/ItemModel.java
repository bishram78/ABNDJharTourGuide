package CardViewModel;

public class ItemModel {
    private String mImageName;
    private int mImageResource;

    public ItemModel(String imageName, int imageResource) {
        mImageName = imageName;
        mImageResource = imageResource;
    }

    public String getImageName() {
        return mImageName;
    }

    public int getImageResource() {
        return mImageResource;
    }
}
