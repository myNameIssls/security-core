package cn.tyrone.security.core.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 权限校验标签
 * @author sls
 *
 */
@SuppressWarnings("serial")
public class RequestPermisstionTag extends TagSupport {
	
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int doStartTag() throws JspException {
		boolean result = false;
		return result ? EVAL_BODY_INCLUDE : SKIP_BODY;
	}
	
}
