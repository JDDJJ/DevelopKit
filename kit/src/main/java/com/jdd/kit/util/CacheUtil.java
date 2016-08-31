package com.jdd.kit.util;


import java.io.File;

import okhttp3.Cache;

/**
 * Created by bobomee on 16/5/15.
 */
public class CacheUtil {

    private static final int HTTP_RESPONSE_DISK_CACHE_MAX_SIZE = 10 * 1024 * 1024;

    private static File getCacheDir(String cachePath) {
        //设置缓存路径
        final File baseDir = new File("/mnt/sdcard" + "/" + cachePath);
        final File cacheDir = new File(baseDir, "HttpResponseCache");
        return cacheDir;
    }

    public static Cache getCache(String cachePath) {
        return new Cache(getCacheDir(cachePath), HTTP_RESPONSE_DISK_CACHE_MAX_SIZE);
    }
}
