package technology.pratz.problem4.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import technology.pratz.problem4.entity.Member;
import technology.pratz.problem4.service.MemberService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @PostMapping
    public ResponseEntity<Member> create(@Valid @RequestBody Member member) {
        Member savedMember = memberService.saveMember(member);
        return ResponseEntity.ok(savedMember);
    }

    @PutMapping
    public ResponseEntity<Member> update(@Valid @RequestBody Member member) {
        Optional<Member> oldMember = memberService.findById(member.getId());
        if(oldMember.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Member savedMember = memberService.saveMember(member);
        return ResponseEntity.ok(savedMember);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@Valid @RequestBody Member member) {
        memberService.deleteMember(member);
        return ResponseEntity.noContent().build();
    }
}

