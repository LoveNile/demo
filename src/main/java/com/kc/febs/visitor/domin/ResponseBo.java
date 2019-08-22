package com.kc.febs.visitor.domin;

import java.util.HashMap;

public class ResponseBo extends HashMap<String, Object> {

	private static final long serialVersionUID = -8713837118340960775L;

	// 成功
	private static final String SUCCESS = "success";
	// 警告
	private static final String WARN = "warn";
	// 异常 失败
	private static final String FAIL = "fail";

	public ResponseBo() {
		put("success", SUCCESS);
		put("errMsg", "操作成功");
	}

	public static ResponseBo error(Object msg) {
		ResponseBo responseBo = new ResponseBo();
		responseBo.put("success", FAIL);
		responseBo.put("errMsg", msg);
		return responseBo;
	}

	public static ResponseBo warn(Object msg) {
		ResponseBo responseBo = new ResponseBo();
		responseBo.put("success", WARN);
		responseBo.put("errMsg", msg);
		return responseBo;
	}

	public static ResponseBo ok(Object msg) {
		ResponseBo responseBo = new ResponseBo();
		responseBo.put("success", SUCCESS);
		responseBo.put("errMsg", msg);
		return responseBo;
	}

	public static ResponseBo ok() {
		return new ResponseBo();
	}

	public static ResponseBo error() {
		return ResponseBo.error("");
	}

	@Override
	public ResponseBo put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
