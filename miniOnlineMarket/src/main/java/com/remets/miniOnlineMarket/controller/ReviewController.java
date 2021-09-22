package com.remets.miniOnlineMarket.controller;

import com.remets.miniOnlineMarket.domain.Review;
import com.remets.miniOnlineMarket.repository.ReviewRepository;
import com.remets.miniOnlineMarket.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;
   @GetMapping
    public List<Review> getAll() {
        return reviewService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Review> getById(long id) {
        return reviewService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        reviewService.deleteById(id);
   }

    @PostMapping
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);

    }

}
