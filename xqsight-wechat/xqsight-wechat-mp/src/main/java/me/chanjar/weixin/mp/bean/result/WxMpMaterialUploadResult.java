package me.chanjar.weixin.mp.bean.result;

import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

import java.io.Serializable;

public class WxMpMaterialUploadResult implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
	 */
	private static final long serialVersionUID = -128818731449449537L;
	private String mediaId;
	private String url;

	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public static WxMpMaterialUploadResult fromJson(String json) {
		return WxMpGsonBuilder.create().fromJson(json, WxMpMaterialUploadResult.class);
	}
	@Override
	public String toString() {
		return "WxMpMaterialUploadResult [media_id=" + mediaId + ", url=" + url + "]";
	}
}
