package technology.pratz.problem4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technology.pratz.problem4.entity.Member;
import technology.pratz.problem4.repositoty.MemberRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findById(Long id){
        return memberRepository.findById(id);
    }

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    public void deleteMember(Member member) {
        memberRepository.delete(member);
    }
}

