package cn.cls.blog.service;

import cn.cls.blog.vo.VoiceVO;

public interface WebSocketService {
    void sendVoice(VoiceVO voiceVO);
}
