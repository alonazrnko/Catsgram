package ru.yandex.practicum.catsgram.dal;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.catsgram.model.Image;

import java.util.List;
import java.util.Optional;

@Repository
public class ImageStorageRepository extends BaseRepository<Image> {

    private static final String FIND_BY_ID_QUERY =
            "SELECT * FROM image_storage WHERE id = ?";

    private static final String FIND_BY_POST_ID_QUERY =
            "SELECT * FROM image_storage WHERE post_id = ?";

    private static final String INSERT_QUERY =
            "INSERT INTO image_storage(post_id, original_file_name, file_path) " +
                    "VALUES (?, ?, ?) RETURNING id";

    private static final String DELETE_QUERY =
            "DELETE FROM image_storage WHERE id = ?";

    public ImageStorageRepository(JdbcTemplate jdbc, RowMapper<Image> mapper) {
        super(jdbc, mapper);
    }

    public Optional<Image> findById(long imageId) {
        return findOne(FIND_BY_ID_QUERY, imageId);
    }

    public List<Image> findByPostId(long postId) {
        return findMany(FIND_BY_POST_ID_QUERY, postId);
    }

    public Image save(Image image) {
        long id = insert(
                INSERT_QUERY,
                image.getPostId(),
                image.getOriginalFileName(),
                image.getFilePath()
        );
        image.setId(id);
        return image;
    }

    public boolean deleteById(long imageId) {
        return delete(DELETE_QUERY, imageId);
    }
}
