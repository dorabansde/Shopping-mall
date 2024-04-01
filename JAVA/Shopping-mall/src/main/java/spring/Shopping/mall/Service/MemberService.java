package spring.Shopping.mall.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.Shopping.mall.Entity.Member;
import spring.Shopping.mall.Repository.MemberRepository;
@RequiredArgsConstructor
@Service
public class MemberService implements Member{
    private final MemberRepository memberRepository;
    @Override
    public Member loadMemberByMemberEmail(String email) {
        return memberRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}
