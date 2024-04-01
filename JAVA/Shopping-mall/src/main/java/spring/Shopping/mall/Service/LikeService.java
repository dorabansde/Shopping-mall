package spring.Shopping.mall.Service;


import spring.Shopping.mall.Entity.Like;
import spring.Shopping.mall.Repository.LikeRepository;

public class LikeService {
    private final LikeRepository likeRepository;

    public Like save(Like request) {
        Like.LIKE_COUNT();
        return LikeRepository.save();
    }
}