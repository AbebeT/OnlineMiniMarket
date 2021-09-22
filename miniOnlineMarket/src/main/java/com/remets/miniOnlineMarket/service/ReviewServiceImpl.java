package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Review;
import com.remets.miniOnlineMarket.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReviewServiceImpl implements ReviewService{
    @Autowired
    ReviewRepository reviewRepository;
    @Override
    public List<Review> getAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Optional<Review> getById(long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public void deleteById(long id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public void addReview(Review review) {
        reviewRepository.save(review);

    }
}
