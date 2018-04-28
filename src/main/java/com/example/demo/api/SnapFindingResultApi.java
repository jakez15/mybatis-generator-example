package com.example.demo.api;

import com.example.demo.entity.SnapComposite;
import com.example.demo.mapper.SnapCompositeMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SnapFindingResultApi {

    private final SnapCompositeMapper snapCompositeMapper;

    public SnapFindingResultApi(SnapCompositeMapper snapCompositeMapper) {
        this.snapCompositeMapper = snapCompositeMapper;
    }

    @GetMapping("/{id}")
    public Optional<SnapComposite> getSnapComposite(@PathVariable Long id) {
        return Optional.ofNullable(snapCompositeMapper.selectByPrimaryKey(id));
    }
}
