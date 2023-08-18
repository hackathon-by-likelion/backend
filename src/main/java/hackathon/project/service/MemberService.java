package hackathon.project.service;

import hackathon.project.repository.MemberRepository;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){ this.memberRepository = memberRepository; }
}
