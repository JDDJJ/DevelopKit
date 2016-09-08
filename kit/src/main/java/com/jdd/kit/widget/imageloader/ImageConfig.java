package com.jdd.kit.widget.imageloader;

import android.widget.ImageView;


/**
 * Created by jess on 8/5/16 15:19
 * contact with jess.yan.effort@gmail.com
 * 图片加载的配置信息
 */
public class ImageConfig {
    private boolean isCircle;
    private String url;
    private ImageView imageView;
    private int placeholder;
    protected int errorPic;

    private ImageConfig(Buidler builder) {
        this.url = builder.url;
        this.imageView = builder.imageView;
        this.placeholder = builder.placeholder;
        this.errorPic = builder.errorPic;
        this.isCircle = builder.isCircle;
    }


    public String getUrl() {
        return url;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public int getErrorPic() {
        return errorPic;
    }


    public boolean isCircle() {
        return isCircle;
    }


    public static final class Buidler {
        private String url;
        private ImageView imageView;
        private int placeholder;
        protected int errorPic;
        private boolean isCircle;

        private Buidler() {
        }

        public Buidler url(String url) {
            this.url = url;
            return this;
        }

        public Buidler placeholder(int placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public Buidler errorPic(int errorPic) {
            this.errorPic = errorPic;
            return this;
        }

        public Buidler imagerView(ImageView imageView) {
            this.imageView = imageView;
            return this;
        }

        public Buidler isCircle(boolean isCircle) {
            this.isCircle = isCircle;
            return this;
        }

        public ImageConfig build() {
            if (url == null) throw new IllegalStateException("url is required");
            if (imageView == null) throw new IllegalStateException("imageview is required");
            return new ImageConfig(this);
        }
    }
}
