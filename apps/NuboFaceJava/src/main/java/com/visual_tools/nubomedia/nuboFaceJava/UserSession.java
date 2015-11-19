/*
 * (C) Copyright 2015 Visual Tools (http://www.visual-tools.com/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */

package com.visual_tools.nubomedia.nuboFaceJava;

import org.kurento.client.IceCandidate;
import org.kurento.client.MediaPipeline;
import org.kurento.client.WebRtcEndpoint;

/**
 * User sessiong  (User session class).
 * 
 * @author Victor Manuel Hidalgo (vmhidalgo@visual-tools.com)
 * @since 6.0.0
 */

public class UserSession {
	private WebRtcEndpoint webRtcEndpoint;
	private MediaPipeline mediaPipeline;

	UserSession() {
	}

	public WebRtcEndpoint getWebRtcEndpoint() {
		return webRtcEndpoint;
	}

	public void setWebRtcEndpoint(WebRtcEndpoint webRtcEndpoint) {
		this.webRtcEndpoint = webRtcEndpoint;
	}

	public MediaPipeline getMediaPipeline() {
		return mediaPipeline;
	}

	public void setMediaPipeline(MediaPipeline mediaPipeline) {
		this.mediaPipeline = mediaPipeline;
	}

	public void addCandidate(IceCandidate i) {
		webRtcEndpoint.addIceCandidate(i);
	}

	public void release() {
		this.mediaPipeline.release();
	}
		
}
