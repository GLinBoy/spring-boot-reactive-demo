CREATE TABLE IF NOT EXISTS Comment(
    id VARCHAR(36) NOT NULL,
    content VARCHAR(512),
    item_id VARCHAR(36),
    user_id VARCHAR(36),
    parent_id VARCHAR(36),
    PRIMARY KEY (id));
